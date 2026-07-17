# Hamming Distance

## Idea

- The solution computes `x ^ y`.
- A bit in the XOR result is `1` exactly where `x` and `y` differ.
- `Integer.bitCount` counts those set bits.

## Why It Works

- XOR compares corresponding bits independently.
- Equal bits produce `0`; different bits produce `1`.
- The Hamming distance is exactly the number of differing bit positions.

## Edge Cases

- Equal numbers have XOR `0`, so the distance is `0`.
- Inputs are non-negative and within 31 bits, but `bitCount` handles the full `int` safely.
- Differences at multiple bit positions are counted independently.

## Complexity

- Time: $O(1)$.
- Space: $O(1)$.
