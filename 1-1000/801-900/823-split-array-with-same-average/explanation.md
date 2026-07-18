# Explanation

## Idea

- Let total sum be `sum` and length be `n`.
- A subset of size `i` must have sum `i * sum / n` to match the whole-array average.
- Build sets of reachable subset sums by subset size up to `n / 2`.

## Why It Works

- If one non-empty subset has the same average as the whole array, the remaining elements also have that same average.
- Only sizes where `i * sum` is divisible by `n` can work.
- The DP sets record every sum reachable with exactly `i` chosen values.
- Finding a reachable target sum for any valid size proves a split exists.

## Edge Cases

- If no subset size has an integral target sum, it returns `false` early.
- Checking only up to `n / 2` is enough because the complement covers larger subset sizes.
- Duplicate numbers are handled by processing each array element once.

## Complexity

- Time: pseudo-polynomial in number of reachable subset sums.
- Space: pseudo-polynomial for the stored sum sets.
