from flask import Blueprint, jsonify, request
from app.googleads.authenticate import main as authenticate
from app.googleads.estimate_keyword_traffic import main as estimator

impressions_mod = Blueprint('impressions_api', __name__)


@impressions_mod.route("/impressions", methods=['POST'])
def autotraderBudgetPredictor():
    keyword_request = request.get_json()
    client = authenticate()
    data = estimator(client, keyword_request)
    return data
