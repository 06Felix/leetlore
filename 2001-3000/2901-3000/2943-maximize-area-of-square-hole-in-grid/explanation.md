# Maximize Area of Square Hole in Grid

## Idea
- Sort removable horizontal and vertical bars separately. In each array, find the longest consecutive run and return that run length plus one as the largest available gap.
- Take the smaller of the two gaps as the square side and return its square.

## Why It Works
- Removing $r$ consecutive bars merges $r+1$ unit cells in that direction; a fixed bar between runs prevents a larger gap.
- A square needs equal space in both directions. The smaller maximum gap is both an upper bound and attainable by choosing suitable consecutive removals in each direction.

## Edge Cases
- Each removal array is nonempty, so a single removable bar already allows a gap of two, matching the helper's initial values.
- Unsorted bars and separated runs are handled by sorting and resetting the running gap to two.

## Complexity
- $O(h\log h+v\log v)$ time for $h$ horizontal and $v$ vertical removable bars.
- Sorting uses implementation-dependent stack space, typically $O(\log h+\log v)$; the scan uses $O(1)$ space.

## Notes
- Both bar arrays are sorted in place. The dimensions `n` and `m` are unused because valid bar indices already encode the usable gaps.
