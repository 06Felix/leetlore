# Explanation

## Idea
- Count each endpoint's appearances using an array indexed by node label minus one.
- Return the node as soon as its count equals the number of edges.

## Why It Works
- In a valid star, the center is incident to all $n-1$ edges and each leaf to exactly one.
- Since $n \ge 3$, a leaf cannot reach the target degree. The node reaching it must therefore be the center.
- The array has `edges.length + 1` entries, which equals the number of nodes under the given constraints.

## Edge Cases
- Edge order and endpoint order do not affect the counts.
- The smallest allowed star has two edges and still distinguishes the center from its leaves.

## Complexity
- Time: $O(n)$ for all edge endpoints.
- Auxiliary space: $O(n)$ for the degree array.

## Notes
- The final `return 1193` is unreachable for a valid star. It is a hard-coded fallback, not a meaningful result for invalid input; the implementation relies on the validity guarantee.
