from json import dumps
from googleads import adwords
from app.googleads.authenticate import main as authenticate


def main(request):
    client = authenticate()

    traffic_estimator_service = client.GetService(
        "TrafficEstimatorService", version="v201809")

    trafficEstimatorSelector = {
        "campaignEstimateRequests": [{
            "campaignId": None,
            "adGroupEstimateRequests": [{
                "adGroupId": None,
                "keywordEstimateRequests": [{
                    "keyword": {
                        "xsi_type": "Keyword",
                        "matchType": "BROAD",
                        "text": request["keywords"][0]
                    },
                    "maxCpc": {
                        "microAmount": "2000000"
                    },
                    "isNegative": False
                }],
                "maxCpc": {
                    "microAmount": "2000000"
                }
            }],
            "criteria": [
                {
                    "xsi_type": "Location",
                    "id": "1023191"  # New York.
                },
                {
                    "xsi_type": "Language",
                    "id": "1000"  # English.
                }
            ],
            "networkSetting": {
                "targetGoogleSearch": True
            },
            "dailyBudget": {
                "microAmount": str(int((request["budget"]["budget"] / 30 * 1000000)))
            }
        }],
        "platformEstimateRequested": False
    }

    # print(dumps(trafficEstimatorSelector, indent=4, sort_keys=True))

    estimates = traffic_estimator_service.get(trafficEstimatorSelector)

    # print(estimates)

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
    click_through_rate = _CalculateMean(min_estimate["clickThroughRate"],
                                        max_estimate["clickThroughRate"])
    mean_impressions = _CalculateMean(min_estimate["impressionsPerDay"],
                                      max_estimate["impressionsPerDay"])
    mean_total_cost = _CalculateMean(min_estimate["totalCost"]["microAmount"],
                                     max_estimate["totalCost"]["microAmount"])

    return {
        "impressions_per_day": mean_impressions,
        # "impressions_per_day": (mean_clicks / click_through_rate),
        "clicks_per_day": mean_clicks,
        "click_through_rate": click_through_rate,
        "cost_per_click": mean_avg_cpc / 1000000,
        "total_cost": mean_total_cost / 1000000,
        "average_position": mean_avg_pos
    }


if __name__ == "__main__":
    main({})
