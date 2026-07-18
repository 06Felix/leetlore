# Explanation

## Idea

- Use BFS from the initial state `"0000"`.
- Treat deadends and already-visited states as a single `seen` set.
- For each state, generate the eight one-wheel moves and return the BFS depth when `target` appears.

## Why It Works

- Each wheel turn has equal cost, so BFS finds the minimum number of turns.
- Adding states to `seen` when enqueued prevents revisiting cycles.
- Trying both directions on each of four wheels covers every valid one-move neighbor.

## Edge Cases

- If `"0000"` is a deadend, return `-1`.
- If the target is `"0000"`, return `0`.
- If BFS exhausts all reachable states, the lock cannot be opened.

## Complexity

- Time: $O(10^4)$, bounded by all lock states.
- Space: $O(10^4)$ for the queue and seen set.
