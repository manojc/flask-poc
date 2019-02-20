def predict_budget(request):

    print("This is autotrader budget predictor")

    print(request["dealer_id"])
    print(request["total_car_price"])
    print(request["average_car_price"])
    print(request["car_count"])
    print(request["currency"])

    return {
        "data": {
            "currency": "USD",
            "predicted_budget": [
                {
                    "term": "annually",
                    "budget": 2000,
                    "recommended": False
                },
                {
                    "term": "monthly",
                    "budget": 200,
                    "recommended": True
                },
                {
                    "term": "weekly",
                    "budget": 60,
                    "recommended": False
                },
                {
                    "term": "daily",
                    "budget": 10,
                    "recommended": False
                }
            ],
            "budget_windows": [
                {
                    "id": 1,
                    "budget": 100,
                    "term": "monthly"
                },
                {
                    "id": 2,
                    "budget": 200,
                    "term": "monthly"
                },
                {
                    "id": 3,
                    "budget": 300,
                    "term": "monthly"
                },
                {
                    "id": 4,
                    "budget": 400,
                    "term": "monthly"
                },
                {
                    "id": 5,
                    "budget": 500,
                    "term": "monthly"
                }
            ]
        },
        "code": "200",
        "message": None,
        "is_successful": True
    }
