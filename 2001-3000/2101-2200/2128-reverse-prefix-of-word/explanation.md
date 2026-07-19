# Explanation

Problem: [Reverse Prefix of Word](https://leetcode.com/problems/reverse-prefix-of-word/)

## Idea

Find the first occurrence of `ch`, take the prefix through that position, reverse it with `StringBuilder`, and append the unchanged suffix.

## Why It Works

`word.indexOf(ch)` returns the first matching index, which is the exact endpoint requested by the problem. Adding one turns that endpoint into the exclusive bound for `substring(0, i)`. Reversing that prefix and appending `substring(i)` keeps every character after the first `ch` in its original order.

If `ch` is absent, `indexOf` returns `-1`, so `i` becomes `0`. The reversed empty prefix plus the full suffix is just the original word.

## Edge Cases

- `ch` at index `0` reverses a one-character prefix, leaving the word unchanged.
- Missing `ch` also leaves the word unchanged.

## Complexity

- Time: `O(n)`.
- Space: `O(n)` for the builder and resulting string.
