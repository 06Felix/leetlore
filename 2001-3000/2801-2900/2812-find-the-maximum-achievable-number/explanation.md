# Find the Maximum Achievable Number

## Idea

- In each operation, move `x` down by `1` and `num` up by `1`.
- This reduces the gap between `x` and `num` by `2`.
- To maximize starting `x`, use all `t` operations in that direction.
- Return `num + 2 * t`.

## Why It Works

- If `x = num + 2t`, then after `t` operations, `x` decreases to `num + t` and `num` increases to `num + t`.
- Any larger `x` would leave a positive gap after `t` operations.
- Therefore `num + 2t` is the maximum achievable value.

## Edge Cases

- `t = 0` would return `num`, though constraints have `t >= 1`.
- Small constraints fit easily in `int`.
- The formula does not need simulation.

## Complexity

- Time: $O(1)$.
- Space: $O(1)$.
