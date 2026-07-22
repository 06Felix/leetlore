# Explanation

Problem: [Second Minimum Time to Reach Destination](https://leetcode.com/problems/second-minimum-time-to-reach-destination/)

## Idea

- Build the undirected graph from the edge list.
- Run a queue search that stores arrival times, not just nodes.
- For each node, keep the smallest and second-smallest distinct arrival times.
- Before traversing an edge, add waiting time if the current traffic signal phase is red.
- Return as soon as the second distinct arrival time for node `n` is found.

## Why It Works

- All edge traversal times and signal rules are deterministic from the current time, so an arrival state determines the next possible arrival time.
- Keeping two distinct best arrival times per node is enough because any later third arrival cannot improve the second minimum route to the destination.
- The queue explores generated arrival times in increasing order for this uniform-time graph with deterministic waits.
- When a new time is strictly larger than the best time and smaller than the stored second best, it is exactly the current best candidate for that node's second arrival.
- The first accepted second arrival at destination `n` is therefore the second minimum total travel time.

## Complexity

- Time: $O(n + m)$ states and edge relaxations up to a small constant factor.
- Space: $O(n + m)$ for the graph, queue, and two arrival times per node.

## Notes

- The fallback return is unreachable under the problem guarantees.
