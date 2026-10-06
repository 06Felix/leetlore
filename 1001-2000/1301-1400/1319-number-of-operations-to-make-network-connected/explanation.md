# Explanation

## Idea
- Begin with `n` separate components and process all cables with union-by-rank disjoint sets and path compression.
- Count an edge as spare when its endpoints are already connected; otherwise merge their components.
- Return `components - 1` if there are enough spare cables, or `-1` otherwise.

## Why It Works
- A cable closing a cycle can be removed without disconnecting its component, so it is available for rewiring.
- Connecting `c` separate components requires at least `c - 1` new links, and that many links are sufficient.
- Thus exactly `c - 1` spare cables must be available to join all components with the minimum number of operations.

## Edge Cases
- An already connected network returns zero.
- Isolated computers remain components; a network without enough redundant cables returns `-1`.

## Complexity
- Time: $O(n + E \alpha(n))$ for `E` cables and inverse-Ackermann factor $\alpha$.
- Auxiliary space: $O(n)$ for disjoint-set arrays, including bounded recursive find depth.
