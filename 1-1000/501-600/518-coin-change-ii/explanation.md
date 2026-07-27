# Explanation

## Idea

Use one-dimensional combination DP. `dp[x]` stores the number of ways to make amount `x` using the coins processed so far.

For each coin, the code updates amounts from `coin` upward so the same coin can be reused.

## Why It Works

`dp[0] = 1` represents choosing no coins.

When processing a coin, every way to make `i - coin` can be extended by one copy of that coin to make `i`.

Processing coins in the outer loop counts combinations by coin type order, avoiding duplicate permutations of the same set of coins.

## Edge Cases

- Amount `0` returns `1`.
- If no combination can form the target, `dp[amount]` remains `0`.
- Large counts are safe under the problem guarantee that the answer fits in `int`.

## Complexity

Time: `O(amount * coins.length)`.

Space: `O(amount)`.
