# Queries on Number of Points Inside a Circle

## Idea

- For each query circle, scan every point.
- Compute the squared distance from the point to the circle center.
- Count the point when the squared distance is at most `r^2`.

## Why It Works

- Comparing squared distances avoids needing square roots while preserving the inside-or-border test.
- Points on the border are included because the check uses `<=`.
- Each query is independent, so direct counting gives the exact answer for that circle.

## Edge Cases

- Duplicate points are counted separately because the loop visits every point entry.
- A point at the center has distance `0` and is always counted.
- The implementation uses `Math.pow` for squaring; with these constraints the resulting double values are exact enough for the integer comparison.

## Complexity

- Time: `O(pq)`, where `p` is the number of points and `q` is the number of queries.
- Space: `O(1)` excluding the output array.
