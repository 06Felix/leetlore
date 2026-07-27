# Explanation

Problem: [Find the Number of Winning Players](https://leetcode.com/problems/find-the-number-of-winning-players/)

## Idea

- Create one color-count dictionary per player.
- Count how many times each player picked each color.
- For each player `i`, check whether any color count is greater than `i`.
- Count each player at most once.

## Why It Works

- A player wins based only on their maximum count of a single color.
- The per-player dictionaries store exact counts for every picked color.
- If any stored count for player `i` is greater than `i`, the winning condition is satisfied.
- Breaking after the first winning color prevents counting the same player multiple times.

## Edge Cases

- Player `0` wins after any one pick because `1 > 0`.
- Players with no qualifying color are not counted.

## Complexity

- Time: $O(n + p)$, where `p` is the number of picks.
- Space: $O(n + p)$ for the dictionaries.

## Notes

- This is a Python solution, not Java; the explanation matches `solution.py`.
