# Explanation

Problem: [Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/)

## Idea

- Store the input array reference in the `NumArray` object.
- For each `sumRange(left, right)` call, iterate from `left` through `right`.
- Accumulate and return the sum of those elements.

## Why It Works

- The constructor keeps access to the original values used for all queries.
- The loop visits every index in the inclusive range exactly once.
- Adding those visited values computes precisely `nums[left] + ... + nums[right]`.

## Edge Cases

- Single-element ranges work because the loop runs once when `left == right`.
- Negative numbers are included directly in the running sum.

## Complexity

- Constructor time: $O(1)$.
- Query time: $O(r - l + 1)$ for `sumRange(l, r)`.
- Space: $O(1)$ beyond storing the input reference.

## Notes

- This accepted implementation answers each query by direct summation rather than using prefix sums.
