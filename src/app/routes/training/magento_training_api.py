from flask import Blueprint, jsonify, request

magento_training_api_module = Blueprint('magento_training_api', __name__)


@magento_training_api_module.route("/training/magento", methods=['POST'])
def autotradertrainingPredictor():
    print(request.get_json())
    data = {
        "data": [
            "magento training API is unavailable at the moment"
        ],
        "code": "200",
        "message": None,
        "isSuccessful": None
    }
    return jsonify(data)
