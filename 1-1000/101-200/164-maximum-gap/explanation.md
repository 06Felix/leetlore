# Explanation

## Idea

- Return `0` immediately when fewer than two numbers exist.
- Sort the array in ascending order.
- Scan adjacent sorted values and keep the largest difference.

## Why It Works

- In sorted order, any successive pair in the final ordering appears as adjacent elements.
- The maximum required gap is therefore the maximum `nums[i] - nums[i - 1]` after sorting.
- The scan checks every adjacent pair exactly once.

## Edge Cases

- A single element returns `0`.
- Duplicate values create gap `0` and do not affect larger gaps.
- Non-negative integer values are safe for direct subtraction within `int` under the stated bounds.

## Complexity

- Time: $O(n \log n)$ due to sorting.
- Space: depends on `Arrays.sort(int[])`, typically $O(\log n)$ stack space.

## Notes

- The problem asks for linear time and linear extra space, but this implementation uses sorting, so it does not satisfy that explicit follow-up restriction even though it computes the correct answer.
