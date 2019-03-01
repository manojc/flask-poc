from json import dumps, loads
from flask import Blueprint, request, jsonify, Response
from app.googleads.estimate_keyword_traffic import main as estimator

impressions_module = Blueprint("impressions_api", __name__)


@impressions_module.route("/impressions", methods=["POST"])
def autotraderBudgetPredictor():
    keyword_request = request.get_json()
    response = estimator(keyword_request)
    return jsonify(response)
