# Explanation

Problem: [Find the Winning Player in Coin Game](https://leetcode.com/problems/find-the-winning-player-in-coin-game/)

## Idea

- Each valid move must take one `75` coin and four `10` coins.
- Simulate moves while `x > 0` and `y > 3`.
- Toggle the winner name after each successful move.
- When no move remains, return the player who made the last move.

## Why It Works

- There is only one way to make total value `115`: `75 + 10 + 10 + 10 + 10`.
- Therefore the game length is exactly the number of complete move bundles available.
- Players alternate turns, so the winner is determined only by the parity of successful moves.
- Toggling after each move tracks that parity exactly.

## Edge Cases

- If no move is possible at the start, Alice cannot move and Bob wins.
- Exact exhaustion after a move correctly gives the mover as winner.

## Complexity

- Time: $O(\min(x, y / 4))$.
- Space: $O(1)$.

## Notes

- This could also be computed directly from `min(x, y / 4)`, but the loop is tiny under the constraints.
