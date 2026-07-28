# Explanation

## Idea

Add the delay to the original arrival time and take the result modulo `24`.

## Why It Works

Times are represented on a 24-hour clock. Adding hours moves forward, and modulo `24` wraps `24` back to `0`, `25` to `1`, and so on.

## Edge Cases

- A sum exactly equal to `24` returns `0`.
- Delays of `24` leave the arrival hour unchanged.

## Complexity

Time: `O(1)`.

Space: `O(1)`.
