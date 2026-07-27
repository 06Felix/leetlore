# Explanation

Problem: [Stone Game II](https://leetcode.com/problems/stone-game-ii/)

## Idea

- Precompute suffix sums of remaining stones.
- Use memoized recursion `find(i, m)` for the best stones current player can get from pile `i` with current `M = m`.
- If the player can take all remaining piles, return the suffix sum.
- Otherwise, try every `x` from `1` to `2m`.
- Minimize the opponent's future result, then subtract it from the remaining total.

## Why It Works

- From state `(i, m)`, all legal moves are exactly choosing `x` piles where `1 <= x <= 2m`.
- After taking `x`, the opponent faces state `(i + x, max(m, x))`.
- Since both players play optimally, the current player should choose the move that leaves the opponent with the fewest stones.
- The current player's stones from this state equal total remaining stones minus the opponent's optimal stones.
- Memoization preserves this optimal value for every state.

## Edge Cases

- When `i + 2m` reaches the end, all remaining piles can be taken immediately.
- Suffix sums make remaining totals constant-time.

## Complexity

- Time: $O(n^3)$ in the straightforward state and move bound.
- Space: $O(n^2)$.

## Notes

- The implementation uses `-1` as the memo sentinel.
