# Explanation

Problem: [Find the Difference of Two Arrays](https://leetcode.com/problems/find-the-difference-of-two-arrays/)

## Idea

Build one set from each array. Remove every value from the opposite set when it appears in the other array, leaving only distinct values unique to each side.

## Why It Works

`set1` initially contains all distinct values from `nums1`, and `set2` contains all distinct values from `nums2`. Removing each `nums1` value from `set2` leaves only values that appear in `nums2` but not in `nums1`. Removing each `nums2` value from `set1` leaves only values that appear in `nums1` but not in `nums2`. Returning those two sets as lists matches the required answer.

## Edge Cases

- Duplicates are ignored because sets store each value once.
- If one side has no unique values, its returned list is empty.

## Complexity

- Time: `O(n + m)`.
- Space: `O(n + m)` for the sets and result lists.
