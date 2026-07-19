# Explanation

Problem: [Number of Segments in a String](https://leetcode.com/problems/number-of-segments-in-a-string/)

## Idea

Scan the string and count the first character of each segment. A character starts a segment when it is not a space and either it is at index `0` or the previous character is a space.

## Why It Works

Every segment has exactly one first non-space character. The condition in the loop is true for that character and false for every later character in the same segment, because those later characters have a non-space predecessor. Spaces are never counted. Therefore the counter equals the number of contiguous non-space segments.

## Edge Cases

- Empty strings and all-space strings return `0`.
- Leading, trailing, and repeated spaces are handled because only transitions from space to non-space count.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
