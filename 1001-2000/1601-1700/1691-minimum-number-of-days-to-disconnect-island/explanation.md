# Explanation

Problem: [Minimum Number of Days to Disconnect Island](https://leetcode.com/problems/minimum-number-of-days-to-disconnect-island/)

## Idea

- First check whether the grid is already disconnected.
- If not, try removing each land cell one at a time.
- After each temporary removal, count islands with DFS.
- If any single removal disconnects the grid, return `1`; otherwise return `2`.

## Why It Works

- If the initial grid has anything other than exactly one island, the answer is `0`.
- Trying every land cell covers every possible one-day move.
- The `disconnected` helper returns true exactly when the grid has zero islands or more than one island.
- If no one-cell removal works, the known property for this problem guarantees at most two removals are enough, so the answer is `2`.

## Edge Cases

- A grid that becomes all water is considered disconnected by `islandsCount != 1`.
- Each temporary removal is restored before trying the next cell.

## Complexity

- Time: $O((mn)^2)$ in the worst case.
- Space: $O(mn)$ for DFS visited state and recursion.

## Notes

- The implementation uses brute-force removal plus island counting, which fits the `30 x 30` constraints.
