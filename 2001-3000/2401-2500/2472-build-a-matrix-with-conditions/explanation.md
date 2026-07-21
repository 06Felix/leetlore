# Explanation

Problem: [Build a Matrix With Conditions](https://leetcode.com/problems/build-a-matrix-with-conditions/)

## Idea

- Topologically sort the row conditions to determine the row order of values `1..k`.
- Topologically sort the column conditions to determine the column order.
- If either graph has a cycle, return an empty matrix.
- Otherwise, map each value to its row index and place it while scanning the column order.

## Why It Works

- A topological order places every prerequisite before its dependent node, so the row order satisfies all row conditions.
- The same argument applies independently to the column order.
- Placing each number at the intersection of its row-order position and column-order position satisfies both sets of constraints at once.
- If a cycle exists in either condition graph, no topological order exists, so no valid matrix can exist.

## Edge Cases

- Values with no conditions still appear in the topological order.
- Duplicate or sparse condition coverage is handled through indegree counting and adjacency lists.

## Complexity

- Time: $O(k + r + c)$, where `r` and `c` are the counts of row and column conditions.
- Space: $O(k + r + c + k^2)$ including graphs and the returned matrix.

## Notes

- The helper returns an empty array when the sorted result does not contain all `k` values.
