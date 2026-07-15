# Explanation

## Idea

- Scan the title from left to right.
- Treat each letter as a one-based digit: `A = 1` through `Z = 26`.
- Shift the accumulated value by base `26`, then add the current digit.

## Why It Works

- Before reading a character, `ans` represents the prefix's column number.
- Appending a one-based base-26 digit changes that value to `ans * 26 + digit`.
- Applying this rule to every character reconstructs the original column number.

## Edge Cases

- Single-letter titles map directly to values `1` through `26`.
- For titles such as `ZY`, the one-based digit conversion correctly carries across positions.

## Complexity

- Time: `O(n)`, where `n` is the title length.
- Space: `O(1)`.
