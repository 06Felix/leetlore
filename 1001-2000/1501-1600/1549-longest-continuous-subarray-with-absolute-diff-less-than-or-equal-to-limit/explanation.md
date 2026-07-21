# Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit

## Idea

- Use a sliding window with left pointer `l` and right pointer `r`.
- Maintain `minQ` as an increasing deque of window values and `maxQ` as a decreasing deque.
- After adding `nums[r]`, shrink from the left while `max - min > limit`.
- Track the largest valid window length.

## Why It Works

- The maximum absolute difference in a window is `max(window) - min(window)`.
- The two monotonic queues expose those values in $O(1)$ at their fronts.
- When the window violates the limit, moving `l` right is the only way to make it smaller.
- Removing outgoing values from queue fronts keeps both queues synchronized with the current window.

## Edge Cases

- A single element is always valid.
- `limit = 0` only allows windows whose values are all equal.
- Duplicate min or max values are preserved because queues store values and remove one matching front per outgoing element.

## Complexity

- Time: $O(n)$ because each value enters and leaves each deque at most once.
- Space: $O(n)$ for the deques in the worst case.
