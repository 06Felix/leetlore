# Valid Perfect Square

## Idea

- The solution binary-searches possible square roots from `1` to `num`.
- At each midpoint, it checks whether `m * m == num`.
- If `m` is too large, the right boundary moves left.
- Otherwise the left boundary moves right.

## Why It Works

- The function $x^2$ is increasing for positive integers.
- Binary search can therefore discard half the possible roots each step.
- Finding an exact square returns `true`.
- If the loop finishes without an exact match, only `num == 1` is accepted by the final return.

## Edge Cases

- `num = 1` returns `true`.
- Large inputs are handled with `long` midpoint arithmetic for `m * m`.
- Non-squares eventually exhaust the search and return `false`.

## Complexity

- Time: $O(\log n)$.
- Space: $O(1)$.
