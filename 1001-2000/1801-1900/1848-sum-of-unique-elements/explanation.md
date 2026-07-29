# Sum of Unique Elements

## Idea

- Count occurrences of each value using a fixed array.
- Values are limited to `1..100`, so the count array has size `101`.
- Add a value to the answer only when its final count is exactly `1`.

## Why It Works

- A unique element is defined as an element appearing exactly once.
- The first pass records the exact frequency of every possible value.
- The second pass sums precisely the values with frequency one.

## Edge Cases

- If every value is repeated, no count is `1` and the answer stays `0`.
- If all values are distinct, every seen value contributes once.
- Values at both bounds, `1` and `100`, are included by the scan range.

## Complexity

- Time: `O(n + 100)`, where `n` is `nums.length`.
- Space: `O(1)` for the fixed count array.
