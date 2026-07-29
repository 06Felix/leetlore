# Can I Win

## Idea

- Handle immediate wins and impossible totals up front.
- Use a bitmask to represent which numbers have already been chosen.
- Recursively test whether the current player has a move that leaves the opponent in a losing state.
- Memoize losing masks in a boolean array.

## Why It Works

- The game state is fully determined by the remaining target total and the set of used numbers.
- If choosing `i` makes the recursive opponent state return `false`, the current player can force a win.
- If every available move lets the opponent win, the current mask is losing and is memoized.
- The sum check rules out games where even choosing all numbers cannot reach the desired total.

## Edge Cases

- `desiredTotal <= 0` returns `true`.
- If `maxChoosableInteger >= desiredTotal`, the first player can win immediately.
- The bitmask uses bit `i` for number `i`, so values up to `20` fit inside the allocated state array.

## Complexity

- Time: `O(2^m * m)` in the worst case, where `m = maxChoosableInteger`.
- Space: `O(2^m)` for memoization plus recursion depth.

## Notes

- The memo array only records losing states; winning states may be recomputed, but correctness is preserved.
