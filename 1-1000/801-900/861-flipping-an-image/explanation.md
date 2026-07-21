# Flipping an Image

## Idea

- Allocate a new `n x n` output matrix.
- For each row, scan the original row from right to left.
- Write values into the output from left to right.
- Invert each bit while copying.

## Why It Works

- Reading a row from right to left performs the horizontal flip.
- Writing into increasing output columns preserves that reversed order.
- Replacing `0` with `1` and `1` with `0` performs the inversion.
- Doing both during one copy gives the final image directly.

## Edge Cases

- A `1 x 1` image is just inverted.
- Palindromic rows still change because bits are inverted.
- The input is not modified because the method builds `ans`.

## Complexity

- Time: $O(n^2)$.
- Space: $O(n^2)$ for the returned matrix.
