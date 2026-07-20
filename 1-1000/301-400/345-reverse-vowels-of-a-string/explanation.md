# Explanation

Problem: [Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/)

## Idea

Use two pointers to find vowels from the left and right ends of the string, then swap those vowels in a mutable `StringBuilder`.

## Why It Works

The left pointer stops at the next vowel that should receive a vowel from the right side, and the right pointer stops at the next vowel that should receive a vowel from the left side. Swapping those two vowels reverses their relative order. After the swap, both pointers move inward, so every vowel pair is swapped exactly once and non-vowels stay in their original positions.

## Edge Cases

- Strings with no vowels or one vowel remain unchanged.
- Both uppercase and lowercase vowels are recognized by `isVowel`.

## Complexity

- Time: `O(n)`.
- Space: `O(n)` for the `StringBuilder`.
