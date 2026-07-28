# Explanation

## Idea

Use Bellman-Ford-style relaxation for probabilities. `maxProb[node]` stores the best probability found so far from `start_node` to that node.

Each pass relaxes every undirected edge in both directions.

## Why It Works

If reaching `u` has probability `p`, then reaching `v` through edge `(u, v)` has probability `p * edgeProbability`.

Relaxing all edges repeatedly propagates best probabilities along paths with more edges. After at most `n - 1` passes, every simple path has been considered.

The early-exit flag stops once a full pass makes no improvement.

## Edge Cases

- Unreachable nodes keep probability `0`.
- Direct and multi-edge paths compete through the same max update.
- Probabilities of `0` never improve another node.

## Complexity

Time: `O(n * E)` worst case.

Space: `O(n)`.
