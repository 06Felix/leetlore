# Explanation

## Idea

The solution turns each value into the total points earned by deleting all copies of that value. After that, the problem is the same as House Robber: choosing value `x` prevents choosing adjacent values `x - 1` and `x + 1`.

It stores these totals in `dp[value]`, then scans the value range while keeping only two rolling states.

## Why It Works

For each value, there are two choices:

- skip it and keep the best score from the previous value
- take it, which adds its total points to the best score from two values back

The recurrence is therefore `max(previousBest, twoBackBest + currentPoints)`. Since adjacent values conflict and non-adjacent values do not, this captures every valid choice set.

## Edge Cases

- Duplicate numbers are combined before the dynamic program runs.
- Missing values contribute `0`, so gaps naturally allow both sides to be selected.
- A single distinct value is handled by taking its accumulated total.

## Complexity

Time: `O(n + U)`, where `U = 10001` is the scanned value range.

Space: `O(U)`.
