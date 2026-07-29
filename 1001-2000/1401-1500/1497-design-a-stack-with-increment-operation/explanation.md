# Design a Stack With Increment Operation

## Idea

- Store stack values in a deque and keep a parallel `incs` list of delayed increments.
- `increment(k, val)` adds `val` only to the marker at the highest affected bottom index.
- On `pop`, apply the top marker and push that marker down to the next lower element.

## Why It Works

- Delayed markers represent increments that should affect all elements below or at a boundary.
- When the top element is popped, its pending increment must also apply to the remaining elements below it, so it is propagated one index down.
- This makes `increment` and `pop` avoid updating every affected stack element individually.

## Edge Cases

- Pushing at full capacity does nothing.
- Popping an empty stack returns `-1`.
- Incrementing more than the current size targets the whole stack by clamping the marker index.

## Complexity

- Time: `O(1)` per operation amortized for the used `ArrayList` tail operations and deque operations.
- Space: `O(maxSize)`.
