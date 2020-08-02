import requests
import json
import jsonpath

def test_au():
    url="http://www.thetestingworldapi.com/api/StDetails/1104"
    res = requests.get(url)
    print(res.text)

def test_au1():
    url = "http://www.thetestingworldapi.com/api/StDetails/1104"
    res = requests.get(url)
    print(res.text)