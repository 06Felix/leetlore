## Idea
- Scan the cities. Whenever a city is unvisited, count a new province and run DFS from it.
- DFS marks the city and scans its adjacency-matrix row to visit every connected neighbor.

## Why It Works
- DFS reaches exactly the connected component containing its starting city.
- Marking cities prevents repeated counting, so each component contributes exactly one province.

## Edge Cases
- Isolated cities each contribute one province; a fully connected graph contributes one.
- Self-connections and cycles are ignored once the destination has been visited.

## Complexity
- O(n²) time because each city's matrix row is scanned once; O(n) auxiliary space for visited flags and the recursive stack.
