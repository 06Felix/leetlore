# Non-negative Integers without Consecutive Ones

## Idea

- Build the binary digits of `num` from least significant to most significant.
- Precompute how many valid bit strings of each length end in `0` or `1`.
- Start with the count of all valid numbers having at most the same bit length, then subtract valid numbers that exceed `num`.

## Why It Works

- A valid bit string ending in `0` can follow either previous ending, while one ending in `1` can only follow a previous `0`.
- This recurrence gives Fibonacci-like counts for strings without consecutive ones.
- When scanning the bits of `num`, consecutive `1`s mean all remaining lower combinations are already within range, so the subtraction pass can stop.
- A `00` pattern at adjacent positions indicates a block of valid numbers counted initially but greater than `num`; subtracting `one[i]` removes that block.

## Edge Cases

- Small inputs such as `1` and `2` produce one- or two-bit DP tables.
- If `num` itself contains consecutive ones, the scan stops at that point.
- The input is positive, so the bit list is never empty.

## Complexity

- Time: `O(log n)`.
- Space: `O(log n)`.
