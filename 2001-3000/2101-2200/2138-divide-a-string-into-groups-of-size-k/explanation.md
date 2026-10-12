## Idea

Take consecutive substrings of length k. If the last substring is shorter, append enough copies of fill to reach k.

## Why It Works

The chunk boundaries preserve every character in order, exactly once. Only the final group can be short, and the appended padding supplies precisely its missing positions.

## Edge Cases

A length divisible by k needs no padding; k greater than the string length produces one padded group.

## Complexity

O(n + k) time and output space; O(k) temporary space for a chunk.

## Notes

The result contains ceil(n/k) groups.

