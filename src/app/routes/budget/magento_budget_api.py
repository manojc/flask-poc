from flask import Blueprint, jsonify, request

magento_budget_routes_module = Blueprint('magento_budget_api', __name__)


@magento_budget_routes_module.route("/budget/magento", methods=['POST'])
def magento_budget_predictor():
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
