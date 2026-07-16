# Explanation

Problem: [Valid Number](https://leetcode.com/problems/valid-number/)

## Idea

- Scan the string once while tracking whether a digit, decimal point, or exponent has been seen.
- A decimal point is allowed only before any exponent and only once.
- An exponent is allowed only once and only after at least one digit.
- A sign is allowed only at the start or immediately after `e`/`E`.

## Why It Works

- `seenNum` confirms that the current numeric part contains at least one digit.
- Seeing an exponent resets `seenNum`, forcing the exponent part to contain digits too.
- `seenDot` and `seenE` reject invalid repeated or misplaced separators.
- Any character outside digits, sign, dot, and exponent notation is rejected immediately.

## Edge Cases

- `"."`, `"+"`, and `"1e"` return false because they end without a required digit.
- `".1"`, `"4."`, and signed exponent forms such as `"3e+7"` are accepted.
- The code trims whitespace before validation, although the current problem constraints do not require surrounding spaces.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
