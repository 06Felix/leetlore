# Explanation

Problem: [Decoded String at Index](https://leetcode.com/problems/decoded-string-at-index/)

## Idea

- First compute the decoded tape length without building the tape.
- Scan the encoded string backward.
- At each step, reduce `k` modulo the current decoded size.
- When `k` maps to the current letter position, return that letter.

## Why It Works

- The forward pass computes the exact decoded length using multiplication for digits and increment for letters.
- In reverse, a digit means the previous decoded prefix was repeated, so `k` can be reduced into one copy with modulo.
- A letter contributes exactly the last position of the current decoded prefix.
- If `k == 0` when visiting a letter, the requested decoded position is that letter.

## Edge Cases

- Very large decoded strings are handled because only the length is stored.
- When `k` is a multiple of the current size, modulo gives `0`, which correctly refers to the last character of that prefix.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.

## Notes

- The fallback return string is unreachable under the problem guarantee that `k` is valid.
