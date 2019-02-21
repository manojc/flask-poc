# flask-poc

## Description

This POC is to understand flask restful APIs.

Clone the GIT repo and fire following commands.

Copy `env.dist` file to `.env` and replace test values with valid values.

```bash

# update package manager (only for first time time)
sudo apt-get update

# install pip (only for first time time)
sudo apt-get install python-pip

# install virtualenv package (only for first time time)
pip install virtualenv

# switch to a directory where you would want to manage environment folders
# create virtualenv instance in desired directory
virtualenv flask_poc_env

# activate the virtual environment
source ./flask_poc_env/bin/activate

# switch to git repo root directory & install dependencies
pip install -r requirements.txt

# start the app
flask run

# exit virtual environment (form any directory)
deactivate
```

---

## Documentation

Application uses `aglio npm package` to generate documentation.

Documentation is by default available at http://localhost:5000

Fire following commands to regenerate the docs -

``` bash

# go to docs directory
cd docs

# install npm packages
npm i

# generate docs (in case you have updated the docs)
npm run docs

```

## Author

Name - Manoj Chalode ([manojc](http://github.com/manojc))

Email - chalodem@gmail.com

---
