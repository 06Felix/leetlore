# 3727. Maximum Alternating Sum of Squares

## Idea

- Rearranging only decides which squared values get a positive sign and which get a negative sign.
- There are `ceil(n / 2)` positive positions and `n / 2` negative positions.
- To maximize the score, put the largest squares in positive positions and the smallest squares in negative positions.

## How the Code Works

- Convert each number to its square and store it in `sq`.
- Sort `sq` in non-decreasing order.
- Subtract the first `n / 2` squares.
- Add the remaining squares.

## Why It Works

- A value placed at a positive position contributes `+x`.
- A value placed at a negative position contributes `-x`.
- If a larger square is negative while a smaller square is positive, swapping them increases the score.
- After sorting, the best arrangement is therefore exactly: smaller half negative, larger half positive.

## Edge Cases

- If `n` is odd, there is one extra positive position, so the middle square is added.
- Negative input values are handled naturally because the score uses squares.
- `long` is used because squared values and their sum can exceed `int`.

## Complexity

- Time: `O(n log n)`
- Space: `O(n)`

## Tags

- Array
- Sorting
- Greedy
