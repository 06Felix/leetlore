# Explanation

Problem: [Number of Wonderful Substrings](https://leetcode.com/problems/number-of-wonderful-substrings/)

## Idea

Represent the parity of counts for the ten possible letters with a 10-bit mask. For each prefix mask, count previous prefixes that differ by either zero bits or one bit, because that means the substring between them has at most one odd-count character.

## Why It Works

The XOR of two prefix masks gives the parity mask of the substring between those prefixes. A substring is wonderful exactly when this mask has either no set bits or one set bit. The implementation keeps `count[mask]`, the number of earlier prefixes with each parity mask. For the current prefix, it adds `count[prefix]` for substrings with all even counts and `count[prefix ^ (1 << i)]` for substrings where only letter `i` is odd. Then it records the current prefix for future substrings.

## Edge Cases

- `count[0] = 1` accounts for substrings starting at index `0`.
- The answer is `long` because there can be `O(n^2)` wonderful substrings.

## Complexity

- Time: `O(10n)`, which is `O(n)`.
- Space: `O(1024)`, one counter per parity mask.
