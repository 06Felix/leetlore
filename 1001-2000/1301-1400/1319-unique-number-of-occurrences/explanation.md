# Explanation

Problem: [Unique Number of Occurrences](https://leetcode.com/problems/unique-number-of-occurrences/)

## Idea

Count how often each value appears, then insert those counts into a set. If a count is already present, two values share the same occurrence count.

## Why It Works

The map stores the exact frequency for every distinct array value. The second loop checks whether all frequencies are unique by adding them to a set. `Set.add` returns `false` when the frequency was already seen, which means uniqueness is violated. If every frequency is added successfully, all occurrence counts are distinct.

## Edge Cases

- A single distinct value always returns `true`.
- Negative numbers are handled as normal map keys.

## Complexity

- Time: `O(n)`.
- Space: `O(u)`, where `u` is the number of distinct values.
