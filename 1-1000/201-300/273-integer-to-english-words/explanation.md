# Explanation

Problem: [Integer to English Words](https://leetcode.com/problems/integer-to-english-words/)

## Idea

- Handle `0` directly as `"Zero"`.
- Use arrays for words below `20` and tens from `20` to `90`.
- Recursively split the number by scale: billion, million, thousand, hundred, tens, and ones.
- Trim each recursive result to remove extra spaces created by empty lower chunks.

## Why It Works

- English representation groups numbers by powers of `1000`, then by hundreds and tens inside each group.
- The helper always emits the word for the highest applicable scale first, then recursively emits the remainder.
- Base cases below `20` and below `100` are covered by the fixed word arrays.
- Trimming removes empty remainder text, so exact multiples of a scale still format correctly.

## Edge Cases

- `0` is returned separately because the helper maps `0` to an empty string.
- Exact values such as `1000` or `1000000` avoid trailing words after trimming.

## Complexity

- Time: $O(\log num)$ recursive scale reductions.
- Space: $O(\log num)$ recursion depth.

## Notes

- The implementation stores the word arrays as instance fields.
