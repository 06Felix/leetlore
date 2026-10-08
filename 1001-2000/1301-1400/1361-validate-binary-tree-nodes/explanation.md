# Explanation

## Idea
- Count incoming child references, rejecting any node with two parents.
- Require exactly one node with no parent, then recursively count all nodes reachable from it and compare with `n`.

## Why It Works
- A valid tree has one root and one parent for every other node.
- Under those indegree checks, a cycle cannot be reachable from the root: entering a cycle would give its entry node a second parent. Thus the recursive count is safe from reachable cycles and tests whether disconnected components remain.

## Edge Cases
- No root rejects a cyclic component covering all nodes; multiple roots reject a forest.
- A disconnected cycle can coexist with one root, but the final reachable count rejects it.

## Complexity
- Time: $O(n)$ for parent checks and reachable counting.
- Auxiliary space: $O(n)$ for indegrees and worst-case recursion depth.

## Notes
- A chain near the 10000-node limit risks Java stack overflow. The existing recursive solution is unchanged.
- The trailing merge-array code is commented out and has no effect on this solution.
