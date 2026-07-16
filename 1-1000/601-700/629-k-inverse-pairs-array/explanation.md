# K Inverse Pairs Array

## Idea

- `dp[i][j]` stores the number of arrays using `1..i` with exactly `j` inverse pairs.
- Inserting `i` into an array of size `i - 1` can add from `0` to `i - 1` new inverse pairs.
- The implementation uses prefix sums to avoid summing that full insertion range every time.
- `dp[i][j] = dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - i]` when the subtraction term exists.

## Why It Works

- The largest value `i` only forms inverse pairs with smaller values placed after it.
- Its insertion position determines exactly how many new inverse pairs are added.
- The raw transition is the sum of `dp[i - 1][j - x]` for all valid `x` from `0` to `i - 1`.
- The prefix-sum recurrence maintains that sliding sum in $O(1)$ per state.

## Edge Cases

- `k = 0` always has one increasing array, initialized by `dp[i][0] = 1`.
- When `j < i`, there is no expired term to subtract.
- The code adds `kMod` before `% kMod` to avoid negative modulo after subtraction.

## Complexity

- Time: $O(nk)$.
- Space: $O(nk)$.
