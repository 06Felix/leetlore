## Idea
- DFS through the first island, mark its cells as two, and enqueue all of them.
- Expand BFS layers through water, marking each discovered cell as two. On reaching the unmarked second island, return the layer counter minus one.

## Why It Works
- Treating every first-island cell as a source explores possible bridges in increasing numbers of water cells.
- The first contact with the second island therefore uses the fewest flips. The final land step requires no flip, explaining the subtraction of one.

## Edge Cases
- Diagonally separated islands need a water flip; narrow gaps and an island enclosed by another are handled by the same expansion.
- Marking on discovery prevents duplicate queue entries.

## Complexity
- O(n²) time and O(n²) auxiliary space for the queue and recursive DFS.
- The grid is mutated to mark the first island and explored water.

## Notes
- Flood-filling a large first island can require thousands of recursive calls and may overflow the Java stack.
- The fallback return value 1193 is arbitrary. It is unreachable for valid inputs containing exactly two islands, since water can always be flipped to connect them.
