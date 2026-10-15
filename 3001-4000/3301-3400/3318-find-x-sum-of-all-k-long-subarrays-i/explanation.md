# Find X-Sum of All K-Long Subarrays I

## Idea

- Maintain frequencies while sliding a k-element window. Rebuild a heap of (-frequency, -value) for every window, then copy it and pop up to x entries to compute frequency times value.

## Why It Works

- The negative tuple ordering ranks greater frequencies first and breaks ties by greater value. Each popped entry contributes every occurrence of that selected value, exactly matching the x-sum definition.

## Edge Cases

- Fewer than x distinct values exhaust the heap and include the whole window. Outgoing values with zero frequency are removed from the map.

## Complexity

- O((n - k + 1) * (d log(d + 1) + x log(d + 1)) + k) time for at most d distinct window values. O(d) working space, plus O(n - k + 1) output.

## Notes

- The actual solution is Python. It rebuilds the heap rather than updating heap priorities in place, and relies on heapq and defaultdict being available in the judge environment; a standalone copy needs those imports.
