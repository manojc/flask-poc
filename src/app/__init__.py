from flask import Flask
from app.routes.ui.routes import ui_module
from app.routes.impressions.impressions_api import impressions_module
from app.routes.budget.autotrader_budget_api import autotrader_budget_api_module
from app.routes.budget.magento_budget_api import magento_budget_api_module
from app.routes.training.autotrader_training_api import autotrader_training_api_module
from app.routes.training.magento_training_api import magento_training_api_module

app = Flask(__name__)

# budget APIs
app.register_blueprint(autotrader_budget_api_module, url_prefix='/api')
app.register_blueprint(magento_budget_api_module, url_prefix='/api')

# impressions API routes
app.register_blueprint(impressions_module, url_prefix='/api')

# training API routes
app.register_blueprint(autotrader_training_api_module, url_prefix='/api')
app.register_blueprint(magento_training_api_module, url_prefix='/api')

# UI Routes
app.register_blueprint(ui_module)
