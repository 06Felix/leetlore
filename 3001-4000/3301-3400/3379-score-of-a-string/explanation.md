# Explanation

Problem: [Score of a String](https://leetcode.com/problems/score-of-a-string/)

## Idea

Scan adjacent character pairs and add the absolute difference of their character codes.

## Why It Works

The score is defined as the sum of absolute ASCII differences between every adjacent pair. The loop visits exactly the pairs `(0,1)`, `(1,2)`, ..., `(n-2,n-1)` and adds `Math.abs(s.charAt(i) - s.charAt(i + 1))` for each one. This directly computes the required sum.

## Edge Cases

- The constraints guarantee at least two characters.
- Equal adjacent characters contribute `0`.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
