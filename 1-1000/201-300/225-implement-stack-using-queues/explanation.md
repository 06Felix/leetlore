# Implement Stack using Queues

## Idea

- The implementation keeps one queue, `q`, but stores elements in stack order.
- On `push(x)`, it appends `x` to the back of the queue.
- It then rotates all earlier elements behind `x`, making `x` the front element.
- With the newest element always at the front, `pop` and `top` are direct queue operations.

## Why It Works

- A queue normally exposes the oldest element first.
- Rotating after each push moves every older element behind the newly inserted value.
- Therefore the front of `q` is always the stack top, and the remaining queue order matches descending recency.
- `pop` removes the front value, exactly matching LIFO behavior.

## Edge Cases

- `top` and `pop` are valid by problem guarantee, so the code does not need empty guards.
- A stack with one element performs zero rotations after the offer.
- `empty` checks whether the underlying queue has no elements.

## Complexity

- `push`: $O(n)$ for the rotation.
- `pop`, `top`, and `empty`: $O(1)$.
- Space: $O(n)$ for the stored values.
