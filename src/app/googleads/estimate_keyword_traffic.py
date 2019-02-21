from googleads import adwords
from app.googleads.authenticate import main as authenticate


def main(client, request=None):
    # Initialize appropriate service.
    traffic_estimator_service = client.GetService(
        "TrafficEstimatorService", version="v201809")

    # Construct selector object and retrieve traffic estimates.
    keywords = [
        {"text": "mars cruise", "matchType": "BROAD"}
    ]

    keyword_estimate_requests = []
    for keyword in keywords:
        keyword_estimate_requests.append({
            "keyword": {
                "xsi_type": "Keyword",
                "matchType": keyword["matchType"],
                "text": keyword["text"]
            }
        })

    # Create ad group estimate requests.
    adgroup_estimate_requests = [{
        "keywordEstimateRequests": keyword_estimate_requests,
        "maxCpc": {
            "xsi_type": "Money",
            "microAmount": "1000000"
        }
    }]

    # Create campaign estimate requests.
    campaign_estimate_requests = [{
        "adGroupEstimateRequests": adgroup_estimate_requests,
        "criteria": [
            {
                "xsi_type": "Location",
                "id": "2840"  # United States.
            },
            {
                "xsi_type": "Language",
                "id": "1000"  # English.
            }
        ],
    }]

    # Create the selector.
    selector = {
        "campaignEstimateRequests": campaign_estimate_requests,
    }

    # Optional: Request a list of campaign-level estimates segmented by
    # platform.
    selector["platformEstimateRequested"] = True

    # Get traffic estimates.
    estimates = traffic_estimator_service.get(selector)

    keyword_estimate = estimates["campaignEstimates"][0]["adGroupEstimates"][0]["keywordEstimates"]

    response = []

    for keyword_item in keyword_estimate:
        response.append(_DisplayEstimate(
            keyword_item["min"], keyword_item["max"]))

    return response


def _CalculateMean(min_est, max_est):
    if min_est and max_est:
        return (float(min_est) + float(max_est)) / 2.0
    else:
        return None


def _DisplayEstimate(min_estimate, max_estimate):
    mean_avg_cpc = (_CalculateMean(min_estimate["averageCpc"]["microAmount"],
                                   max_estimate["averageCpc"]["microAmount"])
                    if "averageCpc" in min_estimate
                    and min_estimate["averageCpc"] else None)
    mean_avg_pos = (_CalculateMean(min_estimate["averagePosition"],
                                   max_estimate["averagePosition"])
                    if "averagePosition" in min_estimate
                    and min_estimate["averagePosition"] else None)
    mean_clicks = _CalculateMean(min_estimate["clicksPerDay"],
                                 max_estimate["clicksPerDay"])
    mean_impressions = _CalculateMean(min_estimate["impressionsPerDay"],
                                      max_estimate["impressionsPerDay"])
    mean_total_cost = _CalculateMean(min_estimate["totalCost"]["microAmount"],
                                     max_estimate["totalCost"]["microAmount"])

    return {
        "mean_avg_cpc": mean_avg_cpc,
        "mean_avg_pos": mean_avg_pos,
        "mean_clicks": mean_clicks,
        "mean_impressions": mean_impressions,
        "mean_total_cost": mean_total_cost
    }


if __name__ == "__main__":
    # Initialize client object.
    adwords_client = authenticate()

    main(adwords_client)
