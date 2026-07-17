# Explanation

## Idea

- Recursively split the current segment into left and right halves.
- Recursively evaluate the left half with a min step and the right half with a max step.
- Combine the two returned values with either `min` or `max`, based on the current level.

## Why It Works

- The game repeatedly pairs adjacent values and alternates min/max by output index.
- Splitting by halves mirrors the tournament tree formed by those repeated reductions.
- The boolean flag tells each recursive level whether its parent position should take a minimum or maximum.

## Edge Cases

- A length-one array returns its only value.
- Power-of-two length guarantees clean recursive halving.
- Large values are compared only; no arithmetic overflow risk.

## Complexity

- Time: $O(n)$.
- Space: $O(\log n)$ recursion stack.
