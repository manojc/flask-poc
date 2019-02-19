from flask import Flask
from app.ui.routes import mod as ui_mod
from app.api.impressions import impressions_mod
from app.api.autotrader_budget_api import autotrader_budget_api_mod

app = Flask(__name__)


app.register_blueprint(autotrader_budget_api_mod, url_prefix='/api')
app.register_blueprint(impressions_mod, url_prefix='/api')
app.register_blueprint(ui_mod)
