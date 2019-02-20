from flask import Blueprint, jsonify, request

autotrader_training_api_mod = Blueprint('autotrader_training_api', __name__)


@autotrader_training_api_mod.route("/training/autotrader", methods=['POST'])
def autotradertrainingPredictor():
    print(request.get_json())
    data = {
        "data": None,
        "code": "200",
        "message": None,
        "is_successful": True
    }
    return jsonify(data)
