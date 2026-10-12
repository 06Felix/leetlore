## Idea

- Sort rectangles by descending squared diagonal length, then descending area, and return the area of the first rectangle.

## Why It Works

- Squaring preserves diagonal order and avoids square roots. With a valid comparator, the secondary area comparison resolves equal diagonals as required.

## Edge Cases

- Equal diagonals may have different areas; side lengths at most 100 keep all products within int.

## Complexity

- O(n log n) time and O(n) worst-case auxiliary space for Java object-array sorting.

## Notes

- Correctness risk: find returns 1 when both squared diagonal and area are equal, including comparing a rectangle with itself. This violates the comparator contract and can cause inconsistent sorting or an IllegalArgumentException. The sorting argument assumes a valid comparator; the stored solution is unchanged.
