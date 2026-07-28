# Explanation

## Idea

Track balance while scanning: add `1` for `L` and subtract `1` for `R`.

Whenever the balance returns to zero, one balanced substring can end there.

## Why It Works

A zero balance means the current segment has equal counts of `L` and `R`.

Cutting immediately at every zero balance maximizes the number of balanced pieces, because delaying the cut would only merge valid segments and reduce the count.

## Edge Cases

- The whole input is guaranteed balanced, so the final balance returns to zero.
- Consecutive small balanced pieces like `LR` are counted separately.
- Long runs such as `LLLLRRRR` produce one split.

## Complexity

Time: `O(n)`.

Space: `O(1)`.
