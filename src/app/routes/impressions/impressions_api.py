from json import dumps, loads
from flask import Blueprint, request, jsonify, Response
from app.googleads.estimate_keyword_traffic import main as estimator

impressions_routes_module = Blueprint("impressions_api", __name__)


@impressions_routes_module.route("/impressions", methods=["POST"])
def impressions_estimator():
    keyword_request = request.get_json()
    response = estimator(keyword_request)
    return jsonify(response)
