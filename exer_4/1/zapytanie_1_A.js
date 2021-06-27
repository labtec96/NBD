printjson(
    db.people.aggregate(
        {
            $group: {
                _id: "$sex",
                "average_weight": { $avg: { $toDouble: "$weight" } },
                "average_height": { $avg: { $toDouble: "$height" } }
            }
        })
        .toArray()
);