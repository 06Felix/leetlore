# Explanation

Problem: [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)

## Idea

- Sort the array in place.
- After sorting, equal values are adjacent.
- Scan neighboring pairs and return `true` as soon as a duplicate pair is found.

## Why It Works

- Sorting groups all equal values into contiguous positions.
- If any value appears at least twice, one adjacent pair must contain that value.
- If the scan finds no equal adjacent pair, every value is distinct.

## Edge Cases

- Arrays of length `1` skip the loop and return `false`.
- Negative values and large values are handled by normal integer sorting.

## Complexity

- Time: $O(n \log n)$ due to sorting.
- Space: $O(\log n)$ auxiliary stack space for Java's primitive array sort.

## Notes

- The implementation mutates `nums` by sorting it, which is acceptable for this LeetCode task.
