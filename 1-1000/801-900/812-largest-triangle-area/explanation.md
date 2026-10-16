# Largest Triangle Area

## Idea

- Enumerate all triples of point indices. Compute their signed area with the determinant formula, take its absolute value, and retain the maximum.

## Why It Works

- Every triangle corresponds to one distinct triple, which the loops visit exactly once. The determinant gives twice its signed area; dividing by two and removing the orientation sign yields its geometric area.

## Edge Cases

- Collinear triples have zero area. Half-integer areas are preserved by division as double.

## Complexity

- O(n^3) time and O(1) auxiliary space.

## Notes

- Coordinate bounds keep determinant arithmetic safely within int range before conversion to double.
