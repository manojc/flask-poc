from flask import Blueprint, jsonify, request
# from app.api.budget.test import test_mod, testFunc

autotrader_budget_api_mod = Blueprint('autotrader_budget_api', __name__)


@autotrader_budget_api_mod.route("/budget/autotrader", methods=['POST'])
def autotraderBudgetPredictor():
    print(request.get_json())
    data = {
        "data": {
            "currency": "USD",
            "predicted_budget": [
                {
                    "term": "annually",
                    "budget": 2000,
                    "recommended": False
                },
                {
                    "term": "monthly",
                    "budget": 200,
                    "recommended": True
                },
                {
                    "term": "weekly",
                    "budget": 60,
                    "recommended": False
                },
                {
                    "term": "daily",
                    "budget": 10,
                    "recommended": False
                }
            ],
            "budget_windows": [
                {
                    "id": 1,
                    "budget": 100,
                    "term": "monthly"
                },
                {
                    "id": 2,
                    "budget": 200,
                    "term": "monthly"
                },
                {
                    "id": 3,
                    "budget": 300,
                    "term": "monthly"
                },
                {
                    "id": 4,
                    "budget": 400,
                    "term": "monthly"
                },
                {
                    "id": 5,
                    "budget": 500,
                    "term": "monthly"
                }
            ]
        },
        "code": "200",
        "message": None,
        "is_successful": True
    }
    return jsonify(data)
