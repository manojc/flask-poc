def predict_budget(request):
    if (int(request["total_car_price"]) >= 5872200 and int(request["car_count"]) >= 135219):
        return 999
    elif (int(request["total_car_price"]) > 3278076 and int(request["total_car_price"]) <= 5872200 and int(request["car_count"]) > 92111 and int(request["car_count"]) <= 135219):
        return 999
    elif (int(request["total_car_price"]) > 2287621 and int(request["total_car_price"]) <= 328076 and int(request["car_count"]) > 68015 and int(request["car_count"]) <= 92111):
        return 899
    elif (int(request["total_car_price"]) > 1552400 and int(request["total_car_price"]) <= 2287621 and int(request["car_count"]) > 50139 and int(request["car_count"]) <= 68015):
        return 799
    elif (int(request["total_car_price"]) > 907690 and int(request["total_car_price"]) <= 1552400 and int(request["car_count"]) > 32067 and int(request["car_count"]) <= 50139):
        return 699
    elif (int(request["total_car_price"]) > 350017 and int(request["total_car_price"]) <= 907690 and int(request["car_count"]) > 16517 and int(request["car_count"]) <= 32067):
        return 599
    elif (int(request["total_car_price"]) > 150294 and int(request["total_car_price"]) <= 350017 and int(request["car_count"]) > 8931 and int(request["car_count"]) <= 16517):
        return 499
    elif (int(request["total_car_price"]) > 69676 and int(request["total_car_price"]) <= 150294 and int(request["car_count"]) > 4586 and int(request["car_count"]) <= 8931):
        return 399
    elif (int(request["total_car_price"]) > 28108 and int(request["total_car_price"]) <= 69676 and int(request["car_count"]) > 2224 and int(request["car_count"]) <= 4586):
        return 299
    elif (int(request["total_car_price"]) > 4651 and int(request["total_car_price"]) <= 28108 and int(request["car_count"]) > 322 and int(request["car_count"]) <= 2224):
        return 199
    elif (int(request["total_car_price"]) > 0 and int(request["total_car_price"]) <= 4651 and int(request["car_count"]) > 0 and int(request["car_count"]) <= 322):
        return 99
    else:
        return None


# call the function
# ================-
if __name__ == '__main__':
    predict_budget({
        "total_car_price": "200000",
        "car_count": 60
    })
