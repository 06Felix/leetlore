# Explanation

## Idea

- If the two strings are equal, return `-1`.
- Otherwise, return the longer string length.

## Why It Works

- When `a.equals(b)`, every subsequence of one string is also a subsequence of the other, so no uncommon subsequence exists.
- When the strings differ, the longer whole string cannot be a subsequence of the shorter string.
- If the strings have equal length but differ, either whole string is not a subsequence of the other, so that length is valid.

## Edge Cases

- Identical strings return `-1`.
- Different strings with the same length return that length.
- Different lengths return the maximum length.

## Complexity

- Time: $O(n)$ for string equality comparison.
- Space: $O(1)$.
