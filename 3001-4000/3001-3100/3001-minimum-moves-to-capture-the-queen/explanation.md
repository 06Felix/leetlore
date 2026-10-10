## Idea
- Test whether rook and queen share a row or column, excluding a bishop strictly between them on that line.
- Otherwise test whether bishop and queen share a diagonal, excluding a rook strictly between them. Return one for a clear capture, or two otherwise.

## Why It Works
- The line and between-piece tests characterize legal one-move captures exactly.
- If no immediate capture exists, two moves suffice: reposition the rook to a queen-aligned square or move the blocking white piece away, then capture. Thus failure of the one-move tests makes two optimal.

## Edge Cases
- A blocking piece must lie strictly between the attacker and queen, not merely somewhere on the same line.
- Both diagonal slopes use c + d or c - d. A bishop blocking a rook line cannot simultaneously attack the queen diagonally on that same line.

## Complexity
- O(1) time for fixed arithmetic comparisons.
- O(1) auxiliary space.
