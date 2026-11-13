# 3420. Count Non-Decreasing Subarrays After K Operations

## Idea

- Process the array from right to left and maintain the current valid window `[i, right]`.
- The deque stores the window after its needed increments as runs of equal values: `[value, count]`.
- Its values decrease from front to back. When a new value is larger than the last run, merge every smaller run into it and add the required increments to `cost`.

## Why It Works

- A non-decreasing array only needs each value to be raised to at least the maximum value on its left.
- Scanning from the right makes that same rule appear as raising smaller suffix runs to the new left value.
- The deque compactly represents these raised runs, so merging one run accounts for all of its elements at once.
- If the cost becomes too large, remove elements from the right until the window is affordable. Every shorter suffix is then valid, contributing `right - i + 1` subarrays that start at `i`.

## Edge Cases

- Equal values stay in separate logical runs only when useful; no operations are added for them.
- A `long` holds both the running adjustment cost and the answer because each can exceed `int` range.
- Every one-element subarray has cost zero, so shrinking never removes the current left endpoint.

## Complexity

- Time: $O(n)$ amortized. Each run enters and leaves the deque at most once.
- Space: $O(n)$ in the worst case.

## Tags

- Array
- Sliding Window
- Monotonic Queue
