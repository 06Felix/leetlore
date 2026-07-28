# Explanation

## Idea

Scan every integer from `1` to `n`. Add it to the answer if it is divisible by `3`, `5`, or `7`.

## Why It Works

The loop checks exactly the required range. The divisibility condition matches the problem statement, so each valid number is added once and each invalid number is skipped.

## Edge Cases

- Numbers divisible by more than one of `3`, `5`, and `7` are still added only once because there is one `if`.
- If no number qualifies before a point, the running sum stays unchanged.

## Complexity

Time: `O(n)`.

Space: `O(1)`.
