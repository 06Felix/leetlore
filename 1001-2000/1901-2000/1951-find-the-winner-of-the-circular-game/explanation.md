# Find the Winner of the Circular Game

## Idea

- Use the Josephus recurrence.
- `find(n, k)` returns the zero-based winner among `n` friends.
- Base case: with one friend, the winner is index `0`.
- For larger `n`, shift the previous winner by `k` modulo `n`.

## Why It Works

- After one friend is removed, the remaining game is the same problem with `n - 1` friends and a rotated start.
- The rotation offset is exactly `k`.
- `(find(n - 1, k) + k) % n` maps the smaller game's winner back to the original circle.
- Adding `1` converts the zero-based index to the required friend label.

## Edge Cases

- `n = 1` returns friend `1`.
- `k = 1` removes friends in order and the recurrence still applies.
- Large `k` values are handled by modulo in the recurrence.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ recursion stack.
