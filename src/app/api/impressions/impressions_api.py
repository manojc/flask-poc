from flask import Blueprint, jsonify

impressions_mod = Blueprint('impressions_api', __name__)


@impressions_mod.route("/impressions")
def autotraderBudgetPredictor(request=None):
    data = {
        "data": {
            "location": "new York",
            "cpm": 1.2,
            "currency": "USD",
            "keywords": [
                "ford"
            ],
            "predictions": [
                {
                    "radius": {
                        "value": 2,
                        "unit": "KM"
                    },
                    "budgetAmount": 99,
                    "impressions": 100000,
                    "clicks": 2000,
                    "marketingPredefinedAudiences": None,
                    "leads": None,
                    "numberOfSales": None,
                    "salesValue": None,
                    "recommended": True
                },
                {
                    "radius": {
                        "value": 5,
                        "unit": "KM"
                    },
                    "budgetAmount": 199,
                    "impressions": 200000,
                    "clicks": 4000,
                    "marketingPredefinedAudiences": None,
                    "leads": None,
                    "numberOfSales": None,
                    "salesValue": None,
                    "recommended": True
                }
            ]
        },
        "code": "200",
        "message": None,
        "isSuccessful": True
    }
    return jsonify(data)
