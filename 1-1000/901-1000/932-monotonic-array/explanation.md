# Monotonic Array

## Idea

- Decide the expected direction by comparing the first and last elements.
- If the array appears increasing, ensure no adjacent pair decreases.
- Otherwise, ensure no adjacent pair increases.

## Why It Works

- For a monotone increasing array, every adjacent pair must satisfy `nums[i - 1] <= nums[i]`.
- For a monotone decreasing array, every adjacent pair must satisfy `nums[i - 1] >= nums[i]`.
- If the endpoint comparison selects the wrong direction, the adjacent scan will catch the contradiction.

## Edge Cases

- Equal endpoints choose the non-increasing branch, which still accepts all-equal arrays.
- Duplicates are allowed in both monotonic directions.
- Single-element arrays return `true`.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
