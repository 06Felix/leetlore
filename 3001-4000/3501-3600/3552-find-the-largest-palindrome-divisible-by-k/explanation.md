# Explanation

## Idea

The solution uses divisibility patterns for each possible `k` from `1` to `9`. It directly constructs the lexicographically largest `n`-digit palindrome satisfying the divisibility rule.

Most cases use as many `9`s as possible, with fixed edge or middle digits only where needed for divisibility.

## Why It Works

For `k` values like `1`, `3`, and `9`, all `9`s is already divisible and is the largest possible palindrome.

For `2`, `4`, `5`, `6`, and `8`, divisibility is controlled by edge digits or short fixed patterns, so the code places the largest valid boundary digits and fills the rest with `9`s.

For `k = 7`, the implementation uses a precomputed middle pattern by `n % 12`, wrapped with blocks of six `9`s on both sides. This preserves palindrome structure while satisfying divisibility by `7`.

## Edge Cases

- Small `n` cases are handled separately where full boundary patterns would not fit.
- No leading zero is introduced because every returned pattern starts with a positive digit.
- `String.repeat` makes construction linear in the output length.

## Complexity

Time: `O(n)`.

Space: `O(n)` for the returned string.

## Notes

The implementation relies on hard-coded divisibility constructions rather than search or DP.
