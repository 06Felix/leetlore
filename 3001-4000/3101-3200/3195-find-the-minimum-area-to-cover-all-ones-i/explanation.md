## Idea

- Scan from each of the four boundaries, subtracting empty outer rows or columns until reaching a one. Multiply the remaining row and column counts.

## Why It Works

- Any covering rectangle must include the topmost, bottommost, leftmost, and rightmost ones. Removing only empty border lines leaves their bounding box, which is the smallest feasible rectangle.

## Edge Cases

- The statement guarantees at least one one; a single one gives area one.

## Complexity

- O(rows·columns) time over four scans and O(1) space.
