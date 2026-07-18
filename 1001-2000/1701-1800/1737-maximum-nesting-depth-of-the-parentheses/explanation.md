# Explanation

## Idea

- Scan the string once.
- Increase the current depth on `'('` and decrease it on `')'`.
- Track the maximum depth ever reached.

## Why It Works

- In a valid parentheses string, the current number of unmatched open parentheses is exactly the current nesting depth.
- Every `'('` enters one deeper level.
- Every `')'` exits one level.
- The maximum value of this counter is the answer.

## Edge Cases

- Strings with no parentheses return `0`.
- Adjacent groups like `()()` reset depth between groups.
- Validity is guaranteed, so the counter will not go negative.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
