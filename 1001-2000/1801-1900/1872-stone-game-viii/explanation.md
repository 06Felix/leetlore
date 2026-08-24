# Stone Game VIII

## Idea

- Convert `stones` into prefix sums in place.
- If the current player chooses to merge through index `i`, they immediately gain `prefix[i]`.
- After that, the opponent plays optimally from the remaining state.
- Work backward and keep `best`, the best score difference the current player can force from the current position.

## Why It Works

- Every valid move must take at least two stones, so the first useful prefix index is `1`.
- Once a player chooses prefix `i`, the score difference from that move is `prefix[i] - opponentBest`.
- From the end, taking all stones gives score difference `prefix[n - 1]`, so that is the base value.
- Moving left, each index either keeps the previous best option or chooses the current prefix and gives the turn advantage to the opponent.

## Edge Cases

- With exactly two stones, the only move is taking both, so the answer is the total sum.
- Negative values are handled naturally because the DP compares score differences, not absolute scores.
- Prefix sums fit in `int` because the total absolute sum is at most `10^9`.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Tags

- Dynamic Programming
- Prefix Sum
- Game Theory
- Array
