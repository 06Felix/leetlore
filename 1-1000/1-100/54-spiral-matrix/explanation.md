## Idea

- Traverse the top edge, right interior edge, bottom edge, and left interior edge of the current rectangle, then shrink all four boundaries. Stop after outputting every cell.

## Why It Works

- These four traversals cover one perimeter clockwise without repeating corner cells. Removing that perimeter leaves the next inner rectangle. The output-count checks stop degenerate final layers before they can repeat cells.

## Edge Cases

- A single row or column terminates as soon as its cells are collected. Empty input is also explicitly handled.

## Complexity

- O(rows·columns) time and O(1) auxiliary space beyond the output.
