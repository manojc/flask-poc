from flask import Blueprint, jsonify, request

impressions_mod = Blueprint('impressions_api', __name__)


@impressions_mod.route("/impressions", methods=['POST'])
def autotraderBudgetPredictor():
    print(request.get_json())
    data = {
        "data": {
            "selected_location": "new York",
            "selected_cpm": 1.2,
            "selected_currency": "USD",
            "selected_keywords": [
                "ford"
            ],
            "selected_budget": {
                "term": "monthly",
                "budget": 200,
                "recommended": True
            },
            "selected_total_car_price": "200000",
            "selected_average_car_price": "4000",
            "selected_car_count": 60,
            "predictions": [
                {
                    "radius": {
                        "value": 2,
                        "unit": "KM"
                    },
                    "budget": 99,
                    "impressions": 100000,
                    "clicks": 2000,
                    "marketing_predefined_audiences": None,
                    "leads": None,
                    "number_of_sales": None,
                    "sales_value": None,
                    "recommended": True
                },
                {
                    "radius": {
                        "value": 5,
                        "unit": "KM"
                    },
                    "budget": 199,
                    "impressions": 200000,
                    "clicks": 4000,
                    "marketing_predefined_audiences": None,
                    "leads": None,
                    "number_of_sales": None,
                    "sales_value": None,
                    "recommended": False
                }
            ]
        },
        "code": "200",
        "message": None,
        "is_successful": True
    }
    return jsonify(data)
