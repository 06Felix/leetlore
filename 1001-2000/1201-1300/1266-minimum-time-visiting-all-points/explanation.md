# Minimum Time Visiting All Points

## Idea
- For each consecutive pair of points, compute absolute horizontal and vertical differences.
- Add the larger difference to the answer.

## Why It Works
- Every move changes each coordinate by at most one, so reaching the next point takes at least the larger coordinate difference.
- Move diagonally for the smaller difference, then along the remaining axis. This attains the lower bound for each required leg.
- Visits must follow the supplied order, so the minimum total is the sum of the independent leg minima.

## Edge Cases
- One point or consecutive duplicate points contributes zero time.
- Negative coordinates and purely horizontal or vertical legs are handled by absolute differences.

## Complexity
- $O(n)$ time and $O(1)$ auxiliary space.
- The stated coordinate and point-count bounds keep the total within `int`; the input is unchanged.
