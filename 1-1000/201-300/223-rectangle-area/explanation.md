# Rectangle Area

## Idea

- Compute each rectangle’s area. Find overlap width and height from the intersection of the coordinate intervals, treating disjoint or touching intervals as zero. Subtract their product from the area sum.

## Why It Works

- Adding the two rectangle areas counts the intersection twice and every other covered point once. Subtracting the intersection once gives the union area by inclusion-exclusion.

## Edge Cases

- Touching edges or corners have zero overlap area. Containment and zero-width rectangles use the same formulas.

## Complexity

- O(1) time and O(1) auxiliary space.

## Notes

- Parameters and intermediate products use long, and the result is cast to int. The stated coordinate bounds keep the final union area within int range.
