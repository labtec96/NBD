printjson(
    db.people.find(
        {
            birth_date: {
                $gte: "2001-01-01T00:00:00Z",
                $lte: "2099-12-13T23:59:00Z"
            }
        },
        {
            _id: 0,
            first_name: 1,
            last_name: 1,
            "location.city": 1
        }
    ).toArray()
)