# Explanation

## Idea

Collect coordinates of all `1` cells in both images. For every pair of `1` cells, count the translation vector that would align them.

The most frequent translation vector gives the largest overlap.

## Why It Works

If a translation moves one `img1` one-cell onto one `img2` one-cell, it has a specific row and column offset.

For a fixed offset, every pair that produces that offset represents one overlapping `1` after translation. Therefore the frequency of an offset is exactly the overlap count for that translation.

Taking the maximum frequency gives the best possible overlap.

## Edge Cases

- If either image has no `1`, the map stays empty and answer remains `0`.
- A `1 x 1` image works naturally.
- The key uses a row offset times `100` plus column offset, safe for `n <= 30`.

## Complexity

Time: `O(a * b)`, where `a` and `b` are the counts of `1`s in both images.

Space: `O(a + b + a * b)` for coordinate lists and offset counts.
