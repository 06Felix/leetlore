# Explanation

## Idea

Use tree DP with rerooting. Moving from a marked node to an odd node costs `1`; moving to an even node costs `2`.

The first DFS stores, for each node, the two largest downward marking times among its child subtrees. The reroot pass sends the best outside-subtree time into each child.

## Why It Works

For a fixed starting node, the time to mark all nodes is the maximum weighted distance from that start to any node, where each destination node contributes its parity-based delay.

The downward DFS gives the best farthest time inside each rooted subtree. During rerooting, a child must use either the parent's outside value or the best sibling branch; if the child's branch was the parent's best, the second-best branch is used instead.

Combining those values gives the farthest marking time for every possible root in one traversal.

## Edge Cases

- A leaf has downward time `0`.
- Keeping top two child times avoids reusing the same child branch when rerooting.
- The cost added while moving from parent to child is based on the node being marked.

## Complexity

Time: `O(n)`.

Space: `O(n)`.
