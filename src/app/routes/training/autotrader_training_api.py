from flask import Blueprint, jsonify, request

autotrader_training_routes_module = Blueprint('autotrader_training_api', __name__)


@autotrader_training_routes_module.route("/training/autotrader", methods=['POST'])
def autotradertrainingPredictor():
    print(request.get_json())
    data = {
        "data": None,
        "code": "200",
        "message": None,
        "is_successful": True
    }
    return jsonify(data)
