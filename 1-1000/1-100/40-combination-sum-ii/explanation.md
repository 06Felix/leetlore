# Explanation

Problem: [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/)

## Idea

- Sort the candidates first.
- Run DFS from a start index, carrying the remaining target and current path.
- At each depth, try each candidate at or after the start index.
- Recurse with `i + 1` so each element is used at most once.
- Skip equal values at the same DFS depth to avoid duplicate combinations.

## Why It Works

- Sorting groups duplicate values together, so duplicates can be detected locally.
- Each recursive call only uses indices after the chosen one, so no array element is reused.
- The DFS tries every increasing index sequence, which covers every possible combination.
- When the remaining target reaches zero, the current path sums exactly to the original target and is added.
- Skipping `candidates[i] == candidates[i - 1]` when `i > s` removes duplicate choices that would create the same combination at the same depth.

## Edge Cases

- If the remaining target becomes negative, that branch stops.
- Duplicate candidate values can still both be used when they are chosen at deeper indices, as in `[1, 1, 6]`.

## Complexity

- Time: $O(2^n \cdot n)$ in the worst case including copied combinations.
- Space: $O(n)$ recursion/path space, excluding the output.

## Notes

- This directory was normalized from the prior interrupted import; the explanation was written here because the problem directory now contains both `problem.md` and `solution.java`.
