# Explanation

Problem: [Form Smallest Number From Two Digit Arrays](https://leetcode.com/problems/form-smallest-number-from-two-digit-arrays/)

## Idea

Try every pair of digits, one from each array. If the digits are equal, that one digit already satisfies both arrays; otherwise, form both possible two-digit numbers and keep the minimum.

## Why It Works

Any valid answer either uses a shared digit from both arrays or uses one digit from `nums1` and one digit from `nums2`. The nested loops enumerate every such choice. For different digits, the smaller two-digit arrangement is the one with the smaller digit in the tens place, and the implementation takes the minimum of both orders. Keeping the minimum over all pairs therefore returns the smallest valid number.

## Edge Cases

- A common digit produces a one-digit answer, which is always better than any two-digit number.
- The initial value `89` is above every possible valid one- or two-digit answer under the digit constraints.

## Complexity

- Time: `O(nm)`, for `n = nums1.length` and `m = nums2.length`.
- Space: `O(1)`.
