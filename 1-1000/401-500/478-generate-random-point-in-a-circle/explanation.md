# Explanation

## Idea
- Sample an angle uniformly from $[0, 2\pi)$.
- Sample a distance as $r\sqrt{U}$ for uniform $U$ in $[0,1)$, convert the polar coordinates to Cartesian coordinates, and add the circle's center.

## Why It Works
- The area inside distance `d` is the fraction $(d/r)^2$ of the circle's total area.
- The sampled radius obeys $P(r\sqrt{U} \le d) = (d/r)^2$, so equal-area regions receive equal probability.
- An independent uniform angle distributes each radial band evenly, and translating coordinates preserves uniformity.

## Edge Cases
- Sampling zero yields the center; sampled points remain within the positive-radius disk apart from ordinary floating-point rounding.
- Negative center coordinates and very small or large permitted radii use the same calculation.

## Complexity
- Construction and each `randPoint()` call: $O(1)$ time.
- Space: $O(1)$ for stored parameters and the returned two-coordinate array.
