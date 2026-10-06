# Explanation

## Idea
- First recursively collect the original sum at each depth and determine the deepest level.
- In a second traversal, assign the root zero. For each parent, subtract its children's original values from the next level's sum and assign that remainder to both children.

## Why It Works
- A node's cousins are exactly the nodes at its depth whose parent differs from its own.
- Subtracting the entire sibling group from the depth total removes the node itself and any sibling, leaving precisely the cousin sum.
- The replacement for both children is computed before either child is recursively modified, preserving the original sibling values needed for subtraction.

## Edge Cases
- A single root and nodes with no cousins receive zero.
- A parent with one child subtracts only that child; missing children contribute zero.

## Complexity
- Time: $O(n)$ for two traversals.
- Auxiliary space: a fixed 100001-entry sum array plus $O(h)$ recursion stack for height `h`.

## Notes
- The tree is modified in place. The fixed capacity relies on the problem's node bound.
- The sum array and deepest-level field are not reset for another call on the same instance; accumulated sums can make reuse incorrect. A skewed tree near the node limit can also exhaust the Java stack.
