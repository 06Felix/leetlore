# Subtree Inversion Sum

## Idea
- Root the tree with BFS and compute subtree DP states using an explicit postorder stack.
- A state stores the inherited inversion parity and distance from the nearest inverted ancestor, capped at `k`.
- Either keep the node's current sign and advance the distance, or invert here when the distance has reached `k`, toggle parity, and pass distance one to its children.

## Why It Works
- Inherited parity determines every value's current sign because each ancestor inversion toggles the entire subtree.
- Only the nearest inverted ancestor matters for a new inversion: all earlier inverted ancestors are farther away. Capping distance at `k` retains exactly the eligibility information.
- Different child branches have no ancestor relationship, so their optimal contributions add independently under the same inherited state.
- Taking the better legal choice for every state yields the optimum; the root starts with normal parity and unrestricted distance `k`.

## Edge Cases
- `k = 1` permits inversions at adjacent ancestor-descendant nodes; large `k` blocks nearby nested inversions but never blocks inversions in separate branches.
- Zero and negative values are handled by both sign choices. Totals use `long`, and iterative traversal avoids recursion depth issues on a long chain.

## Complexity
- Time: $O(nk)$ for two parity states per distance and child-state accumulation.
- Space: $O(nk)$ for DP, plus $O(n)$ adjacency, child lists, and traversal storage.

## Notes
- Java's `long[n][k+1][2]` representation creates many small nested arrays, adding substantial object overhead beyond the stored numbers at the largest constraints.
- The input values and edges are not modified.
