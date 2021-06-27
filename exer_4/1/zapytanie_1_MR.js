printjson(
    db.people.mapReduce(
        function() {
            emit(this.sex, { weight: parseFloat(this.weight), height: parseFloat(this.height) });
        },
        function(keys, vals) {
            let weights = vals.map(value => value.weight);
            let heights = vals.map(value => value.height);

            const avg = array => array.reduce((a, b) => a + b) / array.length;

            return {
                weight: avg(weights),
                height: avg(heights)
            };
        },
        {
            out: { inline: 1 }
        }
    )
);