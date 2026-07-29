# Count Distinct Numbers on Board

## Idea

- Use the known process result directly.
- For `n = 1`, only `1` can ever be on the board.
- For `n > 1`, all numbers from `2` through `n` eventually appear, so the count is `n - 1`.

## Why It Works

- A number `x` can introduce `x - 1` because `x % (x - 1) == 1` for `x > 2`.
- Starting from `n`, this repeatedly reaches every value down to `2`.
- The value `1` is never introduced because no `x % 1` equals `1`.

## Edge Cases

- `n = 1` returns `1` for the initially present value.
- `n = 2` returns `1`, containing only `2`.
- Larger `n` use the closed form `n - 1`.

## Complexity

- Time: `O(1)`.
- Space: `O(1)`.
