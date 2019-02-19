from flask import Blueprint, jsonify

autotrader_training_api_mod = Blueprint('autotrader_training_api', __name__)


@autotrader_training_api_mod.route("/training/autotrader")
def autotradertrainingPredictor(request=None):
    data = {
        "data": [
            "autotrader training API is unavailable at the moment"
        ],
        "code": "200",
        "message": None,
        "isSuccessful": None
    }
    return jsonify(data)
