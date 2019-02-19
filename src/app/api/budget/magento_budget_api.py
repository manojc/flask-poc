from flask import Blueprint, jsonify

magento_budget_api_mod = Blueprint('magento_budget_api', __name__)


@magento_budget_api_mod.route("/budget/magento")
def autotraderBudgetPredictor(request=None):
    data = {
        "data": [
            "magento budget prediction is unavailable at the moment"
        ],
        "code": "200",
        "message": None,
        "isSuccessful": None
    }
    return jsonify(data)
