from flask import Blueprint, render_template

ui_module = Blueprint("site", __name__, template_folder="../../ui/templates")


@ui_module.route("/")
@ui_module.route("/homepage")
def homepage():
    return render_template("index.html")


# default route - error page
@ui_module.route("/", defaults={"path": ""})
@ui_module.route("/<path:path>")
def catch_all(path):
    return render_template("error.html")
