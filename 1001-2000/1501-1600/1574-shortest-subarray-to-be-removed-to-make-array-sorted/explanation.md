# Explanation

## Idea
- Locate the longest nondecreasing prefix and suffix; an already sorted array returns zero.
- First consider deleting everything after that prefix or before that suffix.
- Use two pointers to join a prefix endpoint to a suffix start whenever the prefix value is no greater than the suffix value, minimizing the removed middle length.

## Why It Works
- After one contiguous deletion, the remaining elements consist of a prefix and a suffix, each of which must already be sorted.
- Such a pair is valid exactly when its boundary values are in nondecreasing order.
- For a fixed prefix endpoint, advancing the suffix pointer finds the earliest compatible suffix and hence the shortest deletion. As prefix values increase, that pointer never needs to move backward.

## Edge Cases
- A single element or already sorted array returns zero.
- Strictly decreasing input keeps one element; equal boundary values can be joined because the target order is nondecreasing.

## Complexity
- Time: $O(n)$ across all scans and monotonic pointers.
- Auxiliary space: $O(1)$; the input is unchanged.
