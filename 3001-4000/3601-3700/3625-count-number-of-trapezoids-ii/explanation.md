# Count Number of Trapezoids II

## Idea

- Enumerate every point pair, normalize its direction, and group segments by direction and supporting-line offset. Count segment pairs on distinct parallel lines. Separately group equal full displacement vectors, count their cross-line pairs, and subtract half that second count.

## Why It Works

- Two segments on distinct parallel lines form a trapezoid. A non-parallelogram has one parallel-side pairing, while a parallelogram has two and is initially counted twice. Equal-length parallel opposite sides identify parallelograms; each has two such pairings, so half the displacement-pair count removes exactly the duplicate.

## Edge Cases

- Collinear segment pairs are excluded by requiring different supporting-line offsets. Vertical and negative-slope directions are normalized consistently.

## Complexity

- Expected O(n^2) time and O(n^2) space for the nested HashMaps; GCD adds O(log C) per pair if coordinate bound C is treated as variable.

## Notes

- Direction/vector keys pack the nonnegative x component and y + 2000 into separate bit fields; the stated coordinate bounds keep the latter below 4096. The correction matched brute convex-quadrilateral counting on 400 small random point sets.
