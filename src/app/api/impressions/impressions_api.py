from json import dumps, loads
from flask import Blueprint, request, jsonify, Response
from app.googleads.authenticate import main as authenticate
from app.googleads.estimate_keyword_traffic import main as estimator

impressions_mod = Blueprint("impressions_api", __name__)


@impressions_mod.route("/impressions", methods=["POST"])
def autotraderBudgetPredictor():
    keyword_request = request.get_json()
    client = authenticate()
    return Response(jsonify({"devices": estimator(client, keyword_request)}), mimetype="application/json")
