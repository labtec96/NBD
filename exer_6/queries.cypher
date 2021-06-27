//// 1
MATCH path=shortestPath((darjeeling:town {name:"Darjeeling"})-[*]-(sandakphu:peak {name:"Sandakphu"}))
RETURN path
//// 2
MATCH path=shortestPath((darjeeling:town {name:"Darjeeling"})-[*]-(sandakphu:peak {name:"Sandakphu"}))
WHERE ALL (r IN relationships(path) WHERE r.winter = "true")
RETURN path
//// 3
MATCH path=(darjeeling:town {name:"Darjeeling"})-[*]->(sandakphu:peak {name:"Sandakphu"})
RETURN path, reduce(distance=0, r in relationships(path) | distance+r.distance) AS totalDistance
ORDER BY totalDistance ASC
//// 4
MATCH (a:Airport)<-[:ORIGIN]-(f:Flight)
WITH a, count(f) as flights
RETURN a, flights
ORDER BY flights ASC
//// 5

//// 6
MATCH p = (origin:Airport { name:"LAX" })<-[r1:ORIGIN]-(:Flight)-[r2:ORIGIN|DESTINATION*..10]->(destination:Airport {name: "DAY"})
WITH p, REDUCE(acc = 0, n IN [x IN NODES(p) WHERE 'Flight' IN LABELS(x)] |
  acc + [(n)<-[:ASSIGN]-(ticket) | ticket.price][0]
  ) as price
RETURN p, price
ORDER BY price desc
//// 7
MATCH p = (origin:Airport { name:"LAX" })<-[r1:ORIGIN]-(:Flight)-[r2:ORIGIN|DESTINATION*..10]->(destination:Airport {name: "DAY"})
WITH p, REDUCE(acc = 0, n IN [x IN NODES(p) WHERE 'Flight' IN LABELS(x)] |
  acc + [(n)<-[:ASSIGN]-(ticket) | ticket.price][0]
  ) as price
RETURN p, price
ORDER BY price asc LIMIT 1
//// 8
MATCH p = (origin:Airport { name:"LAX" })<-[r1:ORIGIN]-(:Flight)-[r2:ORIGIN|DESTINATION*..10]->(destination:Airport {name: "DAY"})
WITH p, REDUCE(acc = 0, n IN [x IN NODES(p) WHERE 'Flight' IN LABELS(x)] |
  acc + [(n)<-[:ASSIGN]-(ticket {class: 'business'}) | ticket.price][0]
  ) as price
RETURN p, price
ORDER BY price asc LIMIT 1
//// 9

//// 10