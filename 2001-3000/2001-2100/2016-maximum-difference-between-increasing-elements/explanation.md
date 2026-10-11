# Maximum Difference Between Increasing Elements

## Idea
- Maintain the smallest earlier value while scanning from the second element onward.
- If the current value is strictly larger, compare its difference with the answer, then update the prefix minimum.

## Why It Works
- For each final index, the smallest earlier value produces its largest possible positive difference.
- Updating the minimum after the comparison enforces the strict earlier-index requirement; checking strict value inequality excludes zero differences.

## Edge Cases
- Decreasing or all-equal arrays retain the `-1` answer.
- A later new minimum becomes available only to subsequent values. Differences fit `int` within the stated positive-value bounds.

## Complexity
- Time: $O(n)$ for one scan.
- Space: $O(1)$ auxiliary storage.
