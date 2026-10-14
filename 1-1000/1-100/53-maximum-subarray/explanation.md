## Idea

- Keep the largest subarray sum ending at the current position: either start at the current value or extend the previous sum. Track the largest ending sum seen.

## Why It Works

- Every subarray ending here is either the singleton value or a previous ending subarray extended by that value. Keeping the best predecessor gives the best current ending sum; maximizing across endpoints covers all nonempty subarrays.

## Edge Cases

- All-negative input returns its largest element because the running answer begins at Integer.MIN_VALUE. A one-element input returns that value.

## Complexity

- O(n) time and O(1) space.
