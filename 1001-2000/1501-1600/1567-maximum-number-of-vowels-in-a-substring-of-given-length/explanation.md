# Explanation

Problem: [Maximum Number of Vowels in a Substring of Given Length](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/)

## Idea

Convert the string to a `0/1` vowel indicator array, then use a fixed-size sliding window of length `k` to find the largest vowel count.

## Why It Works

Each `v[i]` is `1` exactly when `s[i]` is a vowel. Therefore the sum of any length-`k` window in `v` equals the number of vowels in the corresponding substring. The implementation computes the first window sum, then slides by adding the new indicator and removing the old one. Since every length-`k` substring is considered, the maximum window sum is the answer.

## Edge Cases

- If all characters are vowels, the answer is `k`.
- If no window contains a vowel, the answer remains `0`.

## Complexity

- Time: `O(n)`.
- Space: `O(n)` for the indicator array.
