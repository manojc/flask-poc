from flask import Blueprint, jsonify, request

magento_budget_api_mod = Blueprint('magento_budget_api', __name__)


@magento_budget_api_mod.route("/budget/magento", methods=['POST'])
def autotraderBudgetPredictor():
    print(request.get_json())
    data = {
        "data": [
            "magento budget prediction is unavailable at the moment"
        ],
        "code": "200",
        "message": None,
        "isSuccessful": None
    }
    return jsonify(data)
