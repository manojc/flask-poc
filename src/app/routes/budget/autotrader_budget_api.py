from flask import Blueprint, jsonify, request
from app.ml.models.autotrader_budget_model_old import predict_budget, get_budget_windows

autotrader_budget_route_module = Blueprint('autotrader_budget_api', __name__)


@autotrader_budget_route_module.route("/budget/autotrader", methods=['POST'])
def autotrader_budget_predictor():
    budget_request = request.get_json()
    predicted_budget = predict_budget(budget_request)
    budget_windows = get_budget_windows()
    return jsonify({
        "predicted_budget": predicted_budget,
        "budget_windows": budget_windows
    })
