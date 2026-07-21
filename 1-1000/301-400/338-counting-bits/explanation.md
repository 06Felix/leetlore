# Counting Bits

## Idea

- Allocate `ans` with length `n + 1`.
- For every integer `i` from `0` to `n`, compute its set-bit count with `Integer.bitCount(i)`.
- Store that count at `ans[i]`.

## Why It Works

- The output definition asks for the number of `1` bits for each integer independently.
- `Integer.bitCount` returns exactly that population count for an `int`.
- Filling indexes in order produces the required array from `0` through `n`.

## Edge Cases

- `n = 0` returns `[0]`.
- Powers of two return `1` because only one bit is set.
- All values fit in `int` under the constraints.

## Complexity

- Time: $O(n)$ at the Java API level.
- Space: $O(n)$ for the output array.

## Notes

- The implementation uses `Integer.bitCount`, so it does not satisfy the follow-up request to avoid built-in bit-count helpers.
