# Number of Subarrays With GCD Equal to K

## Idea

- Try every subarray start and end.
- For each subarray, compute its gcd from scratch.
- Count it when the gcd equals the required value.
- Stop extending a start once the gcd becomes smaller than the target.

## Why It Works

- The nested start/end loops cover every contiguous subarray.
- The innermost loop computes the exact gcd for the selected range.
- As a subarray expands, gcd can only stay the same or decrease, so once it is below `k`, longer subarrays from the same start cannot return to `k`.

## Edge Cases

- Single-element subarrays are checked normally.
- If no element can participate in a gcd of `k`, the answer remains `0`.
- Large element values are safe because gcd uses integer modulo.

## Complexity

- Time: `O(n^3 log V)` as implemented, where `V` is the value range.
- Space: `O(1)`.

## Notes

- The constraints allow `n <= 1000`; this brute-force gcd recomputation is simple but not the most efficient possible approach.
