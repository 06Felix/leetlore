# Combination Sum III

## Idea

- Use backtracking over numbers `1` through `9`.
- Track remaining count `k`, remaining sum `n`, next candidate start `s`, and current `path`.
- When both remaining count and sum are zero, copy the path into the answer.
- After choosing a number, recurse with the next start `i + 1` so numbers are not reused.

## Why It Works

- Increasing `s` enforces strictly increasing combinations, preventing duplicates.
- Each recursive branch represents choosing or skipping future numbers through the loop.
- A path is accepted only when it has exactly the requested size and sum.
- Returning when `k == 0` or `n < 0` prunes impossible branches.

## Edge Cases

- Too-small target sums return no combinations after pruning.
- `k = 9` can only use all numbers once.
- The result order follows DFS order and is valid because any order is allowed.

## Complexity

- Time: $O(\binom{9}{k} \cdot k)$ in the worst case to build result copies.
- Space: $O(k)$ recursion path, excluding output.
