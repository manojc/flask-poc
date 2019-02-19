from flask import Blueprint, jsonify

magento_training_api_mod = Blueprint('magento_training_api', __name__)


@magento_training_api_mod.route("/training/magento")
def autotradertrainingPredictor(request=None):
    data = {
        "data": [
            "magento training API is unavailable at the moment"
        ],
        "code": "200",
        "message": None,
        "isSuccessful": None
    }
    return jsonify(data)
