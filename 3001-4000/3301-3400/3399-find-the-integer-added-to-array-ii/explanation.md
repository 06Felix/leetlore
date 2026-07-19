# Explanation

Problem: [Find the Integer Added to Array II](https://leetcode.com/problems/find-the-integer-added-to-array-ii/)

## Idea

Sort both arrays. Since only two elements are removed from `nums1`, the first element of sorted `nums2` must match one of the first three elements of sorted `nums1` after adding `x`. Try those three possible differences and validate each one with a two-pointer scan.

## Why It Works

After sorting, matching the remaining elements should preserve order. For a candidate `inc`, the validation scan walks through `nums1` and matches each value `num + inc` against the next needed value in `nums2`; unmatched values are treated as removed. If all of `nums2` can be matched while removing at most two values, that `inc` is feasible. Every feasible minimum element in `nums2` can only come from one of the first three sorted elements in `nums1`, because at most two earlier values may be removed, so trying those candidates covers all possible answers.

## Edge Cases

- Negative increments are handled by `nums2[0] - nums1[i]`.
- Duplicate values are handled by sorted order and sequential matching.
- The minimum feasible increment is kept across all valid candidates.

## Complexity

- Time: `O(n log n)` for sorting plus `O(n)` validation for three candidates.
- Space: `O(1)` extra beyond sorting.
