## Idea

- Build a weighted variable graph with reciprocal edges. For each known-variable query, DFS to the target and multiply edge ratios along the found path.

## Why It Works

- For a path A→B→C, multiplying A/B by B/C gives A/C; longer paths telescope in the same way. The noncontradiction guarantee makes every valid path equivalent. DFS visits all reachable variables, so failure means no ratio can be determined.

## Edge Cases

- Unknown variables return −1 even for self-queries. Known self-queries return one. A visited set avoids graph cycles.

## Complexity

- Expected O(E+Q(V+E)) time and O(V+E) graph/search space, plus O(Q) output.
