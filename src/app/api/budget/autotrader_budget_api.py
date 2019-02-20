from flask import Blueprint, jsonify, request
from app.ml.models.autotrader_budget_model import predict_budget

autotrader_budget_api_mod = Blueprint('autotrader_budget_api', __name__)


@autotrader_budget_api_mod.route("/budget/autotrader", methods=['POST'])
def autotraderBudgetPredictor():
    budget_request = request.get_json()
    response = predict_budget(budget_request)
    return jsonify(response)
