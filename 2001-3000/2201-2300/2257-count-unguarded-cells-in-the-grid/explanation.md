# Count Unguarded Cells in the Grid

## Idea

- Mark walls as 3 and all guards as 2. From each guard, trace four rays through empty or already guarded cells, marking visibility as 1 and counting each newly guarded cell once. Subtract occupied and guarded cells from the grid area.

## Why It Works

- A wall or guard stops each ray exactly as required. Previously guarded cells remain transparent to other rays, while counting only transitions from 0 to 1 avoids double-counting intersections.

## Edge Cases

- Blocked guards mark no extra cells. Multiple guards may see the same cell without inflating the count.

## Complexity

- O(rows * cols + guards + walls) time and O(rows * cols) space. Each cell is traversed at most twice horizontally and twice vertically because guards stop rays.

## Notes

- The count field is initialized only when the Solution object is created. Reusing the same instance for another call retains the old count and can return an incorrect result; a fresh instance avoids this risk.
