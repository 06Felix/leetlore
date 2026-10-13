## Idea

- Seed a min-heap with all boundary cells. Repeatedly expand the lowest effective boundary height, collecting the difference for lower unvisited neighbors and pushing them with the raised boundary height.

## Why It Works

- The smallest available boundary is the lowest escape level for newly reached cells. Lower neighbors trap exactly the difference to that level; higher neighbors establish their own level. Heap expansion therefore assigns the minimum enclosing spill level and counts each interior cell once.

## Edge Cases

- Single-row or single-column grids trap no water. Boundary duplicates on narrow grids are harmless because neighbors are marked visited.

## Complexity

- O(rows·columns·log(rows·columns+1)) time and O(rows·columns) space.
