# Maximum Multiplication Score

## Idea

- Use dynamic programming over the prefix of `b` and the number of selected elements.
- `dp[i][j]` stores the best score after considering the first `i` values of `b` and choosing `j` of them.
- For each `b[i - 1]`, either skip it or use it as the `j`th chosen value paired with `a[j - 1]`.

## Why It Works

- The increasing-index requirement means choices can be processed left to right.
- Skipping preserves the best score with the same number of chosen values.
- Taking `b[i - 1]` extends a valid state with one fewer chosen value, so the order of chosen indices remains valid.
- The answer is the best state after all `b` values are processed and exactly four values have been selected.

## Edge Cases

- Negative products are handled by initializing unreachable states to negative infinity.
- When all scores are negative, the DP still picks exactly four values.
- The first row only allows selecting zero values, preventing impossible transitions from being treated as valid.

## Complexity

- Time: `O(n)`, because the second dimension is fixed at `5`.
- Space: `O(n)`, as implemented by the full DP table.
