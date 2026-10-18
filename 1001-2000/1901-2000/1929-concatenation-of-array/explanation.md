# Concatenation of Array

## Idea

- Allocate twice the input length and assign ans[i] = nums[i % n] throughout the result.

## Why It Works

- For indices below n, the remainder is the original index; for the second half, it is i - n. Thus both halves reproduce nums in order.

## Edge Cases

- A one-element input is duplicated twice. Repeated values need no special handling.

## Complexity

- O(n) time and O(1) working space beyond the O(n) returned array.

## Notes

- The original array is unchanged.
