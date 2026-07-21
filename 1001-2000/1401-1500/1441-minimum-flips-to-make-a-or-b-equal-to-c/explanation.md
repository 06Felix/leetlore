# Minimum Flips to Make a OR b Equal to c

## Idea

- Inspect each bit position from `0` through `29`.
- If the target bit in `c` is `1`, at least one of `a` or `b` must have that bit set.
- If the target bit in `c` is `0`, both corresponding bits in `a` and `b` must be `0`.
- Add the minimum flips required for each independent bit.

## Why It Works

- Bitwise OR is independent per bit, so local minimum choices add up globally.
- For target `1`, one flip is needed only when both input bits are `0`.
- For target `0`, every `1` among the two input bits must be flipped to `0`.
- Scanning 30 bits covers all values up to `10^9`.

## Edge Cases

- Already valid inputs add no flips.
- If both `a` and `b` have a `1` where `c` has `0`, two flips are needed.
- High bits beyond the values' lengths are zeros and do not affect the result.

## Complexity

- Time: $O(30)$.
- Space: $O(1)$.
