# Put Marbles in Bags

## Idea
- A cut between positions `i` and `i + 1` contributes `weights[i] + weights[i + 1]` to the total score.
- Sort all adjacent-pair sums, then subtract the sum of the smallest `k - 1` cut costs from the sum of the largest `k - 1` cut costs.

## Why It Works
- Every partition score equals the common endpoint contribution `weights[0] + weights[n - 1]` plus its chosen cut costs.
- Any choice of `k - 1` distinct boundaries produces exactly `k` nonempty contiguous bags, so the smallest or largest costs independently minimize or maximize the score.
- The common endpoint contribution cancels in the difference.

## Edge Cases
- For `k = 1`, no cuts are taken and the difference is zero; for `k = n`, every boundary is taken on both sides, again giving zero.
- Each adjacent sum fits `int` under the constraints, while the accumulated scores and returned difference use `long`.

## Complexity
- Time: $O(n\log n)$ for sorting the adjacent sums.
- Space: $O(n)$ for the sums array; `weights` is left unchanged.
