from flask import Blueprint, render_template

mod = Blueprint('site', __name__, template_folder='templates')

@mod.route('/')
@mod.route('/homepage')
def homepage():
    return render_template('index.html')


# default route - error page
@mod.route('/', defaults={'path': ''})
@mod.route('/<path:path>')
def catch_all(path):
    return render_template("error.html")