from flask import Blueprint, jsonify

autotrader_budget_api_mod = Blueprint('autotrader_budget_api', __name__)


@autotrader_budget_api_mod.route("/budget/autotrader")
def autotraderBudgetPredictor(request=None):
    data = {
        "data": [
            {
                "term": "monthly",
                "budget": 200,
                "currency": "USD",
                "recommended": True
            },
            {
                "term": "weekly",
                "budget": 50,
                "currency": "USD",
                "recommended": False
            },
            {
                "term": "daily",
                "budget": 7.2,
                "currency": "USD",
                "recommended": False
            }
        ],
        "code": "200",
        "message": None,
        "isSuccessful": None
    }
    return jsonify(data)