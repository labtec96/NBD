printjson(
    db.people.insertOne(
        {
            "sex" : "Male",
            "first_name" : "Cezary",
            "last_name" : "Han",
            "job" : "Java Developer",
            "email" : "s15831@pjwstk.edu.pl",
            "location" : {
                "city" : "Warsaw",
                "address" : {
                    "streetname" : "Warszawska",
                    "streetnumber" : "2321"
                }
            },
            "description" : "Opis Test",
            "height" : "182.4",
            "weight" : "78.25",
            "birth_date" : "1921-02-18T07:22:24Z",
            "nationality" : "Polish",
            "credit" : [
                {
                    "type" : "mastercard",
                    "number" : "56022541652043117",
                    "currency" : "PLN",
                    "balance" : "3843.63"
                },
                {
                    "type" : "jcb",
                    "number" : "5602220902466171",
                    "currency" : "SEK",
                    "balance" : "3870.48"
                }
            ]
        }
    )
)