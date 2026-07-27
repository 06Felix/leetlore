# Explanation

## Idea

Flip every bit that belongs to `num`'s binary representation. The loop starts with mask `1` and repeatedly shifts left while the mask is still within `num`.

Each mask is XORed into `num`, which toggles that bit.

## Why It Works

The complement ignores leading zeroes, so only bit positions up to the highest set bit should change.

The condition `i <= num` keeps the loop within that original significant range as lower bits are toggled. XOR with a single-bit mask flips exactly that bit and leaves the rest unchanged.

## Edge Cases

- `num = 1` flips the only bit and returns `0`.
- A power of two flips all lower significant bits as the loop advances.
- The mask is `long`, so shifting past the signed `int` range is safe for the loop condition.

## Complexity

Time: `O(log num)`.

Space: `O(1)`.
