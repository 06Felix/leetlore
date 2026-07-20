# Explanation

Problem: [Greatest Common Divisor of Strings](https://leetcode.com/problems/greatest-common-divisor-of-strings/)

## Idea

Apply a Euclidean-style algorithm to strings. Keep the longer string first, require it to start with the shorter string, and remove repeated copies of the shorter string from the longer one.

## Why It Works

If a string divides both inputs, then the longer input must begin with the shorter input's repeating unit. If the longer string does not start with the shorter string, no common divisor string can exist. Otherwise, removing copies of the shorter string from the longer string preserves the common divisor, just like taking a remainder in numeric gcd. When the second string becomes empty, the first string is the largest repeating unit that divides both original strings.

## Edge Cases

- Non-matching prefixes return the empty string.
- Equal strings eventually produce the whole string as the gcd.

## Complexity

- Time: `O(n^2)` in this implementation because `substring` creates new strings while removing prefixes.
- Space: `O(n)` from recursion and substring creation.
