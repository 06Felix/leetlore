# Stone Game V

## Idea

- Use interval DP because after every split the game continues on only one side of the current row.
- Let `dp[l][r]` be the maximum score Alice can still get from stones `l...r`.
- Try every split position `cut`, so the row becomes `l...cut` and `cut + 1...r`.
- Prefix sums give both side sums in constant time.

## Why It Works

- Bob always removes the side with the larger sum, so Alice scores the smaller sum and continues on that smaller side.
- If the left sum is smaller, the candidate score is `leftSum + dp[l][cut]`.
- If the right sum is smaller, the candidate score is `rightSum + dp[cut + 1][r]`.
- If both sums are equal, Alice can choose which side remains, so we add that sum to the better of the two next states.
- Checking every possible split guarantees the best first move for each interval, and smaller intervals are already solved before larger ones.

## Edge Cases

- One stone has no valid split, so the answer stays `0`.
- Equal split sums must consider both remaining sides.
- Large stone values are safe with `int` here because the maximum score is bounded by the total sum, at most `5 * 10^8`.

## Complexity

- Time: `O(n^3)`
- Space: `O(n^2)`

## Tags

- Dynamic Programming
- Interval DP
- Prefix Sum
- Game Theory
