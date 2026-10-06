# Explanation

## Idea
- Save the starting pixel's original color and recursively visit its four side-sharing neighbors.
- Reject out-of-bounds pixels, pixels of another original color, and pixels already carrying the target color. Recolor a pixel before exploring its neighbors.

## Why It Works
- Every recursive step follows an edge inside the original same-color connected component, so unrelated pixels remain unchanged.
- Recoloring before recursion marks a visited pixel, preventing cycles when the target differs from the original color.
- Exploring all four directions reaches every pixel connected to the start.

## Edge Cases
- If the original and target colors match, the first call returns immediately.
- Grid borders, isolated pixels, and disconnected regions of the same color are handled by the guards.

## Complexity
- Time: $O(mn)$ worst case for an $m \times n$ image.
- Auxiliary space: $O(mn)$ worst-case recursion depth; the image is updated in place.

## Notes
- The recursive implementation depends on sufficient stack capacity for a large connected component.
