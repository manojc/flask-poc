# flask-poc

## Description

This POC is to understand flask restful APIs.

Clone the GIT repo and fire following commands.

```bash

# update package manager
sudo apt-get update

# install pip
sudo apt-get install python-pip

# install virtualenv package
pip install virtualenv

# switch to a directory where you would want to manage environment folders
# create virtualenv instance in desired directory
virtualenv flask_poc_manojc_env

# activate the virtual environment
source ./flask_poc_manojc_env/bin/activate

# switch to the root directory of this git repo
# set environment variables
export FLASK_DEBUG=1
export FLASK_APP=./src/app/__init__.py

# install dependencies
pip install -r requirements.txt

# start the app
flask start

# deactivate (in any directory)
deactivate
```

---

## Author

Name - Manoj Chalode ([manojc](http://github.com/manojc))

Email - chalodem@gmail.com

---
