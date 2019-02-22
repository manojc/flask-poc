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
                        "xsi_type": "Money",
                        "microAmount": "2000000"
                    },
                    "isNegative": False
                }]
            }],
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
            "networkSetting": {
                "targetGoogleSearch": True
            },
            "dailyBudget": {
                "xsi_type": "Money",
                "microAmount": "22000000"
            }
        }],
        "platformEstimateRequested": False
    }

    estimates = traffic_estimator_service.get(trafficEstimatorSelector)

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
        "cost_per_click": mean_avg_cpc,
        "average_position": mean_avg_pos,
        "clicks_per_day": mean_clicks,
        "impressions_per_day": mean_impressions,
        "total_cost": mean_total_cost
    }


if __name__ == "__main__":
    main({})
