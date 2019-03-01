from os import getenv
from flask import Flask
from .routes import autotrader_budget_routes, magento_budget_routes, impressions_routes, autotrader_training_routes, magento_training_routes, ui_routes

app = Flask(__name__)

url_prefix = getenv("API_PREFIX")

# budget APIs
app.register_blueprint(autotrader_budget_routes, url_prefix=url_prefix)
app.register_blueprint(magento_budget_routes, url_prefix=url_prefix)

# impressions API routes
app.register_blueprint(impressions_routes, url_prefix=url_prefix)

# training API routes
app.register_blueprint(autotrader_training_routes, url_prefix=url_prefix)
app.register_blueprint(magento_training_routes, url_prefix=url_prefix)

# UI Routes
app.register_blueprint(ui_routes)
