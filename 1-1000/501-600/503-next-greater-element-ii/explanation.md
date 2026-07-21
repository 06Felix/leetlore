# Next Greater Element II

## Idea

- Traverse indices from `2n - 1` down to `0` to simulate a circular array.
- Keep a decreasing stack of candidate next greater values.
- Pop values less than or equal to the current value.
- During the second half of traversal (`i < n`), write the stack top or `-1`.

## Why It Works

- Scanning from right to left means the stack contains values after the current position in circular order.
- Values `<= current` cannot be the next greater element for current or earlier equal/larger values.
- After popping, the stack top is the nearest greater candidate.
- Traversing `2n` positions gives every index access to one full circular pass.

## Edge Cases

- A globally maximum element gets `-1`.
- Duplicate equal values are popped because they are not greater.
- Single-element arrays return `[-1]`.

## Complexity

- Time: $O(n)$ because each simulated value is pushed and popped at most once.
- Space: $O(n)$ for the stack and answer.
