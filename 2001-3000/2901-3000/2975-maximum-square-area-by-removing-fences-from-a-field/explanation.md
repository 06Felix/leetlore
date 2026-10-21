# Maximum Square Area by Removing Fences From a Field

## Idea
- Copy each fence array, append its two fixed boundary fences, and sort it.
- Build sets of all pairwise horizontal and vertical fence distances. Find the largest common distance, square it in `long`, and apply the required modulus.

## Why It Works
- Keeping any two parallel fences while removing those between them creates a gap equal to their distance; thus pairwise distances enumerate every possible side length.
- A square is possible exactly when a length is available in both orientations. Choosing the largest common length maximizes its area before taking the modulus.

## Edge Cases
- Boundary fences must be considered even though they cannot be removed; they can bound the resulting square.
- No common gap returns `-1`. Squaring a distance up to $10^9-1$ is safe in `long`.

## Complexity
- Expected $O(h^2+v^2)$ time and space for the distance sets, where $h,v$ include the two added boundaries.
- Input arrays are preserved because the implementation sorts extended copies.
