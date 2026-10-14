## Idea

- Run breadth-first search, snapshotting the queue size for each level. Sum exactly that many node values and append sum divided by the level size.

## Why It Works

- The queue contains one level’s nodes at each snapshot. Their children are appended for the next level, so the fixed-size batch sums precisely the current depth. Dividing by its node count gives the required average.

## Edge Cases

- The root is guaranteed nonnull. Double sums avoid int overflow when many large values share a level.

## Complexity

- O(n) time, O(w) queue space, and O(h) output space, where w is maximum width.
