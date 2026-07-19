# Explanation

Problem: [Goal Parser Interpretation](https://leetcode.com/problems/goal-parser-interpretation/)

## Idea

Scan the command left to right. Append `G` directly, and when a `(` is found, inspect the next character to distinguish `()` from `(al)`.

## Why It Works

The input is made only from the tokens `G`, `()`, and `(al)`. A `G` token contributes `"G"`. Every parenthesized token starts with `(`; if the next character is `)`, the token is `()` and contributes `"o"`, otherwise it must be `(al)` and contributes `"al"`. Characters inside the parenthesized token are skipped implicitly because they do not trigger any append on later loop iterations.

## Edge Cases

- Consecutive tokens work because each append is independent.
- The valid-token constraint makes `arr[i + 1]` safe whenever `arr[i] == '('`.

## Complexity

- Time: `O(n)`.
- Space: `O(n)` for the result builder.
