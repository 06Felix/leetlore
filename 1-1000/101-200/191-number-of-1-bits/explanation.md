# Number of 1 Bits

## Idea

- Return Integer.bitCount(n).

## Why It Works

- The Java primitive counts set bits in the integer representation, exactly the required Hamming weight. No additional state or conversion is needed.

## Edge Cases

- A power of two has one set bit. Dense bit patterns are handled by the same primitive.

## Complexity

- O(1) time and O(1) auxiliary space for a fixed 32-bit integer.

## Notes

- This implementation delegates to the JDK primitive rather than scanning bits or maintaining a lookup table.
