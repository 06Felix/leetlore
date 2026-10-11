# Count the Number of Good Subarrays

## Idea
- Maintain a sliding window's frequencies and equal-value pair count.
- Adding a value creates one pair per existing occurrence. While the window has at least `k` pairs, remove its leftmost value and subtract its remaining matches.
- After shrinking, add the left pointer to the answer: all earlier starts yield good subarrays ending at the current right endpoint.

## Why It Works
- Removing an occurrence from frequency $f$ removes exactly $f-1$ pairs, preserving the window count.
- Shrinking stops at the first invalid start; all starts before it were valid, and extending a window cannot decrease its pair count.
- Every subarray is counted once at its right endpoint.

## Edge Cases
- Distinct values may yield zero; repeated values can create many valid starts for one endpoint.
- `k` is positive, so shrinking cannot remove an empty window. The returned count uses `long`.

## Complexity
- Expected time: $O(n)$ because each endpoint moves forward at most $n$ times.
- Space: $O(d)$ for $d$ distinct values; zero-frequency entries remain stored.

## Notes
- The pair counter `rc` is `int`, but it remains safe here: after shrinking it is below $k\le10^9$, and one insertion adds at most 99,999 pairs. It never accumulates the unrestricted whole-array pair total.
