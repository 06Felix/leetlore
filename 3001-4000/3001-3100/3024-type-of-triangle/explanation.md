# Type of Triangle

## Idea
- Reject sides failing any strict triangle inequality.
- Otherwise classify all-equal sides as equilateral, any equal pair as isosceles, and the rest as scalene.

## Why It Works
- Positive sides form a nondegenerate triangle exactly when each pair sums to more than the third side.
- Testing all equality first makes the later equal-pair branch mean exactly two equal sides.

## Edge Cases
- Equality in a triangle inequality is degenerate and returns `none`.
- Side order does not matter; sums fit `int` for the bounded inputs.

## Complexity
- Time: $O(1)$ for fixed comparisons.
- Space: $O(1)$ auxiliary storage.
