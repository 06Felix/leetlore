# Explanation

Problem: [Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)

## Idea

- Handle empty and single-node lists as base cases.
- For a pair `(first, second)`, make `second` the new head of this segment.
- Recursively swap the list after the pair.
- Point `first.next` to that swapped remainder and `second.next` to `first`.

## Why It Works

- The base cases are already correctly swapped because no full pair exists.
- For any list with at least two nodes, swapping the first pair locally produces the correct order for those two nodes.
- The recursive call returns the correctly swapped remainder by the same rule.
- Connecting the first swapped pair to that returned remainder gives the correct full list.

## Edge Cases

- Empty list returns `null`.
- Odd-length lists leave the final single node unchanged.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ recursion depth.

## Notes

- The implementation changes node links only; node values are not modified.
