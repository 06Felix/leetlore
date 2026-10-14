## Idea

- Flatten the alternating board labels into a square-index array. BFS from square one, trying six die outcomes and applying at most one snake or ladder before enqueueing an unvisited destination.

## Why It Works

- Each move is an unweighted graph edge after its mandatory single jump. BFS explores squares by increasing roll count, so first reaching the final square is optimal. Flattening preserves the board’s boustrophedon labels.

## Edge Cases

- Cycles are blocked by visited destinations. Oversized die values are clamped to the final square, duplicating an already legal landing there rather than creating a smaller answer.

## Complexity

- O(n²) time and space because each square has at most six moves.
