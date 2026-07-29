# Minimum Time Difference

## Idea

- Convert each `"HH:MM"` string into minutes after midnight.
- Mark seen minute values in a boolean array of size `1440`.
- If a minute repeats, the minimum difference is immediately `0`.
- Scan the seen minutes in order and compare adjacent times, including the wrap from the last time to the first.

## Why It Works

- In sorted order, the minimum circular time difference must be between neighboring time points.
- The boolean array gives sorted traversal by minute without explicitly sorting the input.
- The wrap check handles pairs that cross midnight, such as `23:59` and `00:00`.

## Edge Cases

- Duplicate time points return `0`.
- Times near midnight are handled by `1440 - last + first`.
- The first seen time is tracked as `st` to support both the scan start and wrap comparison.

## Complexity

- Time: `O(n + 1440)`, where `n` is the number of time points.
- Space: `O(1440)`, effectively constant.
