# 856. Score of Parentheses

## Idea

- Every innermost pair `"()"` contributes one unit of score.
- If that pair is inside `d` outer pairs, its contribution gets doubled `d` times.
- So a primitive pair closed at depth `d` contributes `2^d`.

## How the Code Works

- `depth` tracks how many open parentheses are active.
- When we see `'('`, we go one level deeper.
- When we see `')'`, we first move one level back up.
- If the previous character was `'('`, we just closed a primitive `"()"`, so we add `1 << depth`.

## Why It Works

- The rules only create score from primitive `"()"` groups.
- Wrapping a group in parentheses doubles its score, which is exactly the same as shifting that primitive contribution by its surrounding depth.
- Adjacent balanced groups naturally add into `ans`, matching the `AB = A + B` rule.

## Edge Cases

- `"()"` adds `1 << 0 = 1`.
- Deeply nested strings like `"((()))"` add only at the innermost pair.
- Side-by-side groups like `"()()"` add once for each primitive pair.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Tags

- Stack
- String
- Counting
