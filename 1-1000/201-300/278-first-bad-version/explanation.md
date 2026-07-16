# First Bad Version

## Idea

- The solution binary-searches the version range `[1, n]`.
- If `m` is bad, the first bad version is at `m` or to its left.
- If `m` is good, the first bad version must be to its right.
- The search stops when both bounds point to the first bad version.

## Why It Works

- The problem guarantees monotonic behavior: once a version is bad, all later versions are bad.
- Binary search is valid on this true/false boundary.
- Keeping `r = m` when `m` is bad preserves `m` as a possible answer.
- Moving `l = m + 1` when `m` is good discards only known-good versions.

## Edge Cases

- `n = 1` returns `1`.
- If the first version is bad, the right bound keeps moving left to `1`.
- The midpoint uses `l + (r - l) / 2` to avoid integer overflow.

## Complexity

- Time: $O(\log n)$ API calls.
- Space: $O(1)$.
