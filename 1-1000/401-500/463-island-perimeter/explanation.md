# Island Perimeter

## Idea
- Count land cells and count land-to-land adjacencies only above and to the left of each land cell.
- Return four times the land count minus twice the adjacency count.

## Why It Works
- An isolated unit land cell contributes four sides.
- Each shared side is counted once by the up/left checks but appears twice in the initial four-sides-per-cell total, so subtracting two removes exactly its internal contribution.

## Edge Cases
- A single land cell contributes four; grid-edge sides need no separate checks.
- Adjacent cells are counted only horizontally and vertically, matching the statement's connectivity and perimeter definitions.

## Complexity
- $O(rows\cdot cols)$ time and $O(1)$ auxiliary space.
- The grid is unchanged; the variable named `islands` counts land cells rather than connected islands.
