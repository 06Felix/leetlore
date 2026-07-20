# Explanation

Problem: [Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/)

## Idea

Walk through both strings with separate indices. On each loop, append the next character from `word1` if available, then the next character from `word2` if available.

## Why It Works

The required merge alternates starting with `word1`. The implementation follows that order in every iteration. Once one string is exhausted, its append condition fails, while the other string continues contributing its remaining characters. Therefore the result contains all characters in the required alternating order with the longer suffix appended at the end.

## Edge Cases

- Equal-length strings alternate until both end together.
- If one string is longer, its remaining characters are appended after the other index reaches the end.

## Complexity

- Time: `O((n + m)^2)` in this implementation because repeated string concatenation copies accumulated content.
- Space: `O(n + m)` for the result string.

## Notes

For these constraints, repeated `String` concatenation is accepted. A `StringBuilder` would be the usual scalable implementation.
