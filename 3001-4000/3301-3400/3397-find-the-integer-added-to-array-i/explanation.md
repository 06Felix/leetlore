# Explanation

Problem: [Find the Integer Added to Array I](https://leetcode.com/problems/find-the-integer-added-to-array-i/)

## Idea

Find the minimum value in each array. Since every element of `nums1` was shifted by the same integer `x`, the minimum also shifts by `x`, so `x = min(nums2) - min(nums1)`.

## Why It Works

Adding the same value to every element preserves ordering and frequency relationships. Therefore the smallest element in the transformed `nums1` must match the smallest element in `nums2`. The difference between those two minima is exactly the common amount added to every element.

## Edge Cases

- A single-element array works directly because that element is also the minimum.
- If the arrays are already equal, the two minima match and the answer is `0`.
- Negative `x` is handled naturally by subtraction.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
