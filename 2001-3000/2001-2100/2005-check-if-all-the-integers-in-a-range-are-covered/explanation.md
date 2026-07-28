# Check if All the Integers in a Range Are Covered

## Idea

- Use a small counting array because every endpoint is between `1` and `50`.
- For each interval, increment the count for every covered integer.
- Scan `left` through `right`; any zero count means that integer is uncovered.

## Why It Works

- The counter for value `x` is positive exactly when at least one range includes `x`.
- The target interval is inclusive, so checking every integer from `left` to `right` directly matches the required condition.
- Returning `false` on the first zero is safe because all target values must be covered.

## Edge Cases

- Overlapping ranges just increase counts; only zero versus nonzero matters.
- A single-value query range works because the scan includes both endpoints.
- Intervals outside `[left, right]` are harmless since the final scan ignores them.

## Complexity

- Time: `O(R * 50 + W)`, effectively constant under the constraints, where `R` is the number of ranges and `W = right - left + 1`.
- Space: `O(1)` for the fixed-size count array.
