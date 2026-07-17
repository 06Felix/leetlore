# Explanation

## Idea

- Track the first index where each value appears.
- Track the count of each value.
- Whenever a value reaches a new degree, update the answer to its current span; when it ties the degree, keep the shorter span.

## Why It Works

- A subarray with the same degree for value `x` must include every occurrence of `x` from its first to current/latest occurrence.
- The span `i - first[x] + 1` is the shortest subarray covering all occurrences seen so far for `x`.
- Maintaining the maximum frequency and shortest matching span gives the required minimum length.

## Edge Cases

- A single-element array returns `1`.
- Multiple values can share the same degree; the smaller span wins.
- Values that appear once are handled while degree is `1`.

## Complexity

- Time: $O(n)$ average.
- Space: $O(n)$.
