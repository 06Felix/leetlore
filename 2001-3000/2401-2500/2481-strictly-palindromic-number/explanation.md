# Explanation

## Idea

- Return `false` for every valid input.
- No integer `n >= 4` is strictly palindromic.

## Why It Works

- For any `n >= 4`, consider base `n - 2`.
- In that base, `n` is represented as `12`, because `n = 1 * (n - 2) + 2`.
- `12` is not a palindrome, so the requirement fails for at least one required base.

## Edge Cases

- The constraint starts at `n = 4`, where base `2` representation is already not strictly valid.
- Larger values fail by the same base `n - 2` argument.

## Complexity

- Time: $O(1)$.
- Space: $O(1)$.
