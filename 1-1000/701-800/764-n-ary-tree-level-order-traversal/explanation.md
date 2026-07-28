# Explanation

## Idea

Use breadth-first search with a queue. Each queue size snapshot represents one level of the N-ary tree.

For every level, collect node values and enqueue their children for the next level.

## Why It Works

BFS visits nodes in increasing depth order. Processing exactly the current queue size separates one level from the next.

Children are enqueued after their parent is read, so they appear in the following level in the same order as stored in the child list.

## Edge Cases

- A null root returns an empty list.
- Nodes with null child lists are accepted and simply add no children.
- Wide levels are handled by the queue.

## Complexity

Time: `O(n)`.

Space: `O(w)`, where `w` is the maximum level width, plus output storage.
