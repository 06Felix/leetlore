## Idea

- Keep the original state in bit zero and record the next state in bit one. Count original live cells in each 3×3 neighborhood, apply the rules, then shift every cell right once.

## Why It Works

- Reading only bit zero makes all neighbor counts refer to the same original generation. The neighborhood includes the center, so an originally live cell survives for counts three or four, while a dead cell is born for count three. The final shift reveals only the computed next generation.

## Edge Cases

- Boundary neighborhoods are clipped to the board. A single isolated live cell dies.

## Complexity

- O(rows·columns) time and O(1) auxiliary space.

## Notes

- The board is updated in place. The optional infinite-board extension is not implemented.
