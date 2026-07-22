# Explanation

Problem: [Sort Array by Increasing Frequency](https://leetcode.com/problems/sort-array-by-increasing-frequency/)

## Idea

- Count each value with a hash map.
- Put each distinct value into a priority queue.
- The queue orders lower frequency first; ties use larger numeric value first.
- Poll each value and write it back to `nums` as many times as its count.

## Why It Works

- The frequency map stores the exact number of occurrences for every distinct value.
- The priority queue comparator matches the required ordering: increasing frequency and decreasing value for equal frequencies.
- Polling values from the queue therefore visits groups in the required sorted order.
- Writing each value exactly its counted number of times preserves all original elements.

## Edge Cases

- Negative numbers work because values are map keys.
- Equal frequencies are resolved by `b - a`, placing larger values earlier.

## Complexity

- Time: $O(n + u \log u)$, where `u` is the number of distinct values.
- Space: $O(u)$.

## Notes

- The implementation mutates and returns the input array.
