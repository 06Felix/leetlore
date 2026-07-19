# Explanation

Problem: [Longer Contiguous Segments of Ones than Zeros](https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/)

## Idea

Scan the string once while tracking the current run length of `1`s and `0`s. Whenever the character changes, record the finished run in the matching maximum and reset the opposite counter.

## Why It Works

At any position, only one of the two current counters can be growing because the string is binary. When a `0` appears, the current run of `1`s must be finished, so its length can safely update `m1`; the symmetric logic applies when a `1` appears. After the loop, the final run has not yet been closed by a different character, so the implementation updates both maxima once more. The result is true exactly when the longest `1` run is strictly longer than the longest `0` run.

## Edge Cases

- A string with only one digit type leaves the other maximum at `0`.
- Equal longest runs correctly return `false` because the comparison is strict.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
