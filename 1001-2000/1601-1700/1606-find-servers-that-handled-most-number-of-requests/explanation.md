# 1606. Find Servers That Handled Most Number of Requests

## Idea

- Keep busy servers in a min-heap ordered by the time they finish their current request.
- Keep free server IDs in a `TreeSet`, which can quickly find the first free server at or after the preferred ID.
- For request `i`, prefer server `i % k`; if it is unavailable, wrap around to the smallest free ID.

## Why It Works

- Before each request arrives, every server with finish time at most its arrival time is moved back to the free set.
- `ceiling(i % k)` chooses the first available server in the required circular order. If that does not exist, `first()` performs the wraparound.
- Each successful assignment increments exactly the count for its assigned server, so collecting every server with the maximum count returns all busiest servers.

## Edge Cases

- When every server is busy, the request is dropped without changing either structure.
- Several servers can finish at the same time; the loop releases all of them before selecting a server.
- A `long` finish time avoids overflow when combining an arrival time and a load.

## Complexity

- Time: $O(m \log k)$, where $m$ is the number of requests.
- Space: $O(k)$.

## Tags

- Array
- Heap (Priority Queue)
- Ordered Set
- Simulation
