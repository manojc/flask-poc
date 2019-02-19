from flask import Flask
from app.ui.routes import mod as ui_mod
from app.api.impressions.impressions_api import impressions_mod
from app.api.budget.autotrader_budget_api import autotrader_budget_api_mod
from app.api.budget.magento_budget_api import magento_budget_api_mod
from app.api.training.autotrader_training_api import autotrader_training_api_mod
from app.api.training.magento_training_api import magento_training_api_mod

app = Flask(__name__)

# budget APIs
app.register_blueprint(autotrader_budget_api_mod, url_prefix='/api')
app.register_blueprint(magento_budget_api_mod, url_prefix='/api')

# impressions API routes
app.register_blueprint(impressions_mod, url_prefix='/api')

# training API routes
app.register_blueprint(autotrader_training_api_mod, url_prefix='/api')
app.register_blueprint(magento_training_api_mod, url_prefix='/api')

# UI Routes
app.register_blueprint(ui_mod)
