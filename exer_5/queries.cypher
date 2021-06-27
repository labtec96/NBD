//// 1
MATCH (movies:Movie) RETURN movies
//// 2
MATCH (hugoWeaving:Person {name: "Hugo Weaving"})-[:ACTED_IN]->(hwMovies) RETURN hugoWeaving,hwMovies
//// 3
MATCH (hugoWeaving:Person {name: "Hugo Weaving"})-[:ACTED_IN]->(hwMovies)<-[:DIRECTED]-(directors)
RETURN hwMovies, directors
//// 4
MATCH (hugoWeaving:Person {name:"Hugo Weaving"})-[:ACTED_IN]->(m)<-[:ACTED_IN]-(actorsInSameMovie)
RETURN actorsInSameMovie, m
//// 5
MATCH (movie:Movie)<-[:ACTED_IN]-(person) WHERE (person)-[:ACTED_IN]->(:Movie { title: "The Matrix" })
RETURN movie, person
//// 6
MATCH (actor:Person)-[acted:ACTED_IN]-(:Movie)
RETURN actor, count(acted.roles) as `Number of movies`
//// 7
MATCH (director:Person)-[:DIRECTED]->(movie:Movie)<-[:WROTE]-(writer:Person) WHERE writer = director
RETURN director, movie
//// 8
MATCH (hugoWeaving:Person {name:"Hugo Weaving"})-[:ACTED_IN]->(m)<-[:ACTED_IN]-(keanuReeves:Person {name:"Keanu Reeves"})
RETURN m, hugoWeaving, keanuReeves
//// 9
CREATE (CaptainAmerica:Movie {title:'Captain America', released:2011, tagline:'Avenger'})
CREATE (Chris:Person {name:'Chris Evans', born:1981})
CREATE (Hugo:Person {name:'Hugo Weaving', born:1960})
CREATE (Samuel:Person {name:'Samuel L. Jackson', born:1948})
CREATE (Joe:Person {name:'Joe Johnston', born:1950})
CREATE (Christopher:Person {name:'Christopher Markus', born:1970})
CREATE (Stephen:Person {name:'Stephen McFeely', born:1969})
CREATE
   (Chris)-[:ACTED_IN {roles:['Steve Rogers', 'Captain America']}]->(CaptainAmerica),
   (Hugo)-[:ACTED_IN {roles:['Johann Schmidt', 'Red Skull']}]->(CaptainAmerica),
   (Samuel)-[:ACTED_IN {roles:['Nick Fury']}]->(CaptainAmerica),
   (Joe)-[:DIRECTED]->(CaptainAmerica),
   (Christopher)-[:WROTE]->(CaptainAmerica),
   (Stephen)-[:WROTE]->(CaptainAmerica)

MATCH (people:Person)-[relatedTo]-(CaptainAmerica:Movie {title: "Captain America"})
RETURN people, relatedTo, CaptainAmerica