# Surface Area of 3D Shapes

## Idea

- Each nonzero tower contributes `4 * height + 2` faces before accounting for neighbors.
- For each vertical adjacency already seen above or to the left, subtract the hidden shared faces.
- Shared faces between towers equal `2 * min(height1, height2)`.

## Why It Works

- A tower of height `h` has four side faces per cube plus one top and one bottom face.
- Adjacent towers hide one face from each tower for every overlapping cube level.
- Checking only up and left avoids subtracting each adjacency twice.

## Edge Cases

- Empty cells contribute no top, bottom, or side faces.
- Equal-height adjacent towers hide all side faces between them.
- Single-cell grids are handled by the base tower contribution.

## Complexity

- Time: `O(n^2)`.
- Space: `O(1)`.
