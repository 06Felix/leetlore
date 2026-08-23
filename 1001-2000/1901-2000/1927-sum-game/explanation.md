# Sum Game

## Idea

- Track the current known difference as `leftSum - rightSum`.
- Also count how many `?` characters are in the left half and in the right half.
- If the total number of `?` characters is odd, Alice has the last move and can force the sums to be different.
- If the count is even, Bob wins only when the remaining unknown digits can exactly balance the current difference.

## Why It Works

- A `?` on the left can increase the final difference by `0...9`.
- A `?` on the right can decrease the final difference by `0...9`.
- With an even number of moves, Bob can mirror Alice unless one side has extra question marks.
- Every extra pair of question marks on one side can shift the final balance by `9`.
- So Bob can force equality exactly when `sum == (right - left) / 2 * 9`; otherwise Alice wins.

## Edge Cases

- Odd number of `?` characters always means Alice wins.
- No `?` characters is handled by the same formula.
- The string length is even, so the two halves are always well-defined.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Tags

- Game Theory
- Greedy
- Math
- String
