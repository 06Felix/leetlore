# Buddy Strings

## Idea

- If lengths differ, return `false`.
- If the strings are already equal, a valid swap requires at least one duplicate character.
- Otherwise, collect mismatch indices and verify there are exactly two that cross-match.

## Why It Works

- One swap can only fix two mismatched positions.
- For mismatches `i` and `j`, swapping works exactly when `s[i] == goal[j]` and `s[j] == goal[i]`.
- When strings already match, swapping two equal letters leaves the string unchanged, so duplicates are necessary and sufficient.

## Edge Cases

- Equal strings with all unique characters return `false`.
- More than two mismatches cannot be fixed by one swap.
- Single-character strings cannot satisfy the duplicate case.

## Complexity

- Time: `O(n)`.
- Space: `O(n)` for mismatch indices, plus fixed character counts.
