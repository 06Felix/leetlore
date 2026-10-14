# Shortest Path to Get All Keys

## Idea

- Run BFS over (row, column, key mask). Reject walls and locks without their key; collecting a key sets its bit. Track visited states separately for each mask.

## Why It Works

- Each BFS layer represents one more move. Position and owned keys determine all legal future moves, so the first transition collecting the complete mask gives the shortest valid route.

## Edge Cases

- Revisiting a cell with additional keys is allowed. Exhausting the queue returns -1.

## Complexity

- O(rows * cols * 2^k) time and space for k keys.

## Notes

- The mask size relies on the statement guarantee that keys are the first k letters, a through f.
