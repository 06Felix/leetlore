# Predict the Winner

## Idea

- The solution models the game by score difference, not by two separate scores.
- `maxP1(nums, l, r)` returns the best score advantage the current player can force from subarray `l..r`.
- Choosing the left value gives `nums[l] - maxP1(l + 1, r)` because the opponent then gets their best advantage.
- Choosing the right value is symmetric, and the current player takes the better of the two choices.

## Why It Works

- A subgame is fully determined by the current remaining interval.
- Subtracting the recursive result correctly flips perspective between the current player and the opponent.
- If the final advantage is non-negative, player 1 can tie or win, and ties count as wins.

## Edge Cases

- A single number returns that number as the current player's advantage.
- Equal final scores return `true` because the code checks `>= 0`.
- The implementation does not memoize, but `nums.length <= 20` keeps the exhaustive recursion acceptable.

## Complexity

- Time: $O(2^n)$ in the current implementation.
- Space: $O(n)$ recursion depth.

## Notes

- A memoized interval DP could reduce this to $O(n^2)$, but this explanation describes the submitted recursive solution.
