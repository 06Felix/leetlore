# Explanation

## Idea

Use suffix dynamic programming. `dp[i]` stores the number of valid decodings for the suffix starting at index `i`.

At each position, the code tries decoding one digit and two digits when those choices are valid.

## Why It Works

If `s[i]` is not `0`, it can stand alone, contributing `dp[i + 1]` ways.

If `s[i..i + 1]` is between `10` and `26`, those two digits can decode together, contributing `dp[i + 2]` ways.

The DP runs from right to left, so both future suffix counts are already known.

## Edge Cases

- A trailing `0` initializes its suffix count to `0`.
- Leading zeroes never contribute a one-digit decode.
- Values like `10` and `20` work only through the two-digit branch.

## Complexity

Time: `O(n)`.

Space: `O(n)`.
