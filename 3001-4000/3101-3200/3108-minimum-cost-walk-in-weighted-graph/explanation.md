# Minimum Cost Walk in Weighted Graph

## Idea
- Build a union-find structure with path compression and union by rank.
- Store the AND of all edge weights in each component; every edge updates this value, including edges whose endpoints are already connected.

## Why It Works
- AND can only remove bits, so ANDing every component edge gives a lower bound on every walk cost.
- Because repeated edges and vertices are allowed, a walk can visit every edge in its component before reaching the destination. Repeated AND operations do not change the result.
- Queries within one component return that component's AND; queries across components return `-1`.

## Edge Cases
- Parallel edges, cycles, and zero-weight edges must all contribute to the component AND.
- The initial 17-bit all-ones mask covers all permitted edge weights. Distinct isolated vertices are disconnected; the same-vertex branch returns zero, although queries exclude that case.

## Complexity
- Time: $O(n + (m + q)\alpha(n))$ amortized, for $m$ edges and $q$ queries.
- Space: $O(n)$ auxiliary storage, plus $O(q)$ for the answer.
