## Idea

- Sort and maintain a window whose largest minus smallest value is at most one. Update the answer only when the difference equals one.

## Why It Works

- If the span exceeds one, discarding the left endpoint is necessary before that right endpoint can belong to a valid window. Otherwise extending right preserves all useful duplicates. The largest window with exactly two consecutive values gives the optimum subsequence.

## Edge Cases

- An all-equal array returns zero: the required difference is exactly one. Negative values are supported.

## Complexity

- O(n log n) time and O(log n) sorting stack.

## Notes

- Sorting modifies the input array.
