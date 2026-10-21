# Separate Squares I

## Idea
- Sum every square's area independently, including overlaps multiple times, and search between the lowest bottom and highest top.
- At each candidate height, sum full areas of squares below it and partial areas `side * (line - bottom)` for intersected squares.
- Binary-search the first height whose below-area reaches half the total, stopping when the interval width is at most $10^{-5}$; return its lower endpoint.

## Why It Works
- Each square contributes a continuous, nondecreasing below-area function. Their sum has the same properties and ranges from zero to the total area.
- Keeping the upper endpoint when below-area reaches half seeks the first feasible height, including the lower edge of any equal-area gap.
- On termination the lower endpoint lies within the search tolerance of that boundary, subject to floating-point rounding.

## Edge Cases
- Overlapping squares are deliberately counted separately; their x coordinates do not affect the calculation.
- Gaps between vertically separated squares can produce an interval of valid lines; the lower-bound search selects its minimum.

## Complexity
- $O(n\log(H/\varepsilon))$ time for initial height span $H$ and $\varepsilon=10^{-5}$; each area check scans all squares.
- $O(1)$ auxiliary space. Areas are multiplied in `long` before conversion to `double`; endpoints fit in `int` under the stated bounds.
