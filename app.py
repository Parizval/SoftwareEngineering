from flask import Flask, render_template, request, redirect, url_for, session

app = Flask(__name__, static_url_path='/static')

app.debug = True
app.secret_key = "Nothing"


@app.route("/")
def IndexPage():
    return render_template('index.html')

@app.route("/Login")
def Login():
    return  render_template('Login.html')

@app.route("/DashBoard")
def DashBoard():
    return render_template('Dashboard/index.html')


@app.route("/old")
def Old():
    return render_template('old.html')


@app.route("/Testing")
def Test():
    return render_template('Dashboard/Test.html')

@app.errorhandler(404)
def error404(error):
    return render_template('404.html'), 404

if __name__ == "__main__":
    app.run()
