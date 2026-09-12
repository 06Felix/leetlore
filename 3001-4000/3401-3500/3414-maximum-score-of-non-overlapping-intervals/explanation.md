# Maximum Score of Non-overlapping Intervals

## Idea

- Sort intervals by start position.
- For each interval, find the first later interval that starts strictly after its end.
- Use DP where `dp[i][k]` is the best result using intervals from `i` onward while choosing at most `k` intervals.
- Each DP state stores both the total score and the sorted original indices used for lexicographic tie-breaking.

## Why It Works

- Intervals that share a boundary overlap, so after taking interval `i`, the next valid interval must have `start > end[i]`.
- At each interval, the only choices are to skip it or take it and jump to its next compatible interval.
- Since at most 4 intervals can be chosen, the DP has only 5 pick-count columns.
- When scores tie, comparing sorted original index arrays gives the required lexicographically smallest answer.

## Edge Cases

- Choosing fewer than 4 intervals is allowed because the base state with an empty index list is valid.
- Boundary-touching intervals are rejected by using the first start strictly greater than the current end.
- Large weights are stored in `long` inside DP to avoid sum overflow.

## Complexity

- Time: `O(n log n + 4n)`.
- Space: `O(4n)`.

## Tags

- Dynamic Programming
- Binary Search
- Sorting
- Intervals
- Lexicographic Order
