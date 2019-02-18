from flask import Flask, render_template as rt, jsonify
app = Flask(__name__)


@app.route("/")
@app.route("/home")
def hello():
    return rt("index.html")


@app.route("/about-us")
def aboutUs():
    return rt("about-us.html")


@app.route("/api/budget/autotrader")
def autotraderBudgetPredictor():
    data = {
        "value": 1
    }
    return jsonify(data)

# default route - error page
@app.route('/', defaults={'path': ''})
@app.route('/<path:path>')
def catch_all(path):
    return rt("error.html")
