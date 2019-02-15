from flask import Flask, render_template
app = Flask(__name__)

@app.route("/")
@app.route("/home")
def hello():
    return render_template("index.html");

@app.route("/about-us")
def aboutUs():
    return render_template("about-us.html");

# default route - error page
@app.route('/', defaults={'path': ''})
@app.route('/<path:path>')
def catch_all(path):
    return render_template("error.html");