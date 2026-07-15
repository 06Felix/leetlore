# Explanation

Problem: [Find Players With Zero or One Losses](https://leetcode.com/problems/find-players-with-zero-or-one-losses/)

## Idea

- Use a `TreeMap` from player id to loss count.
- Insert each winner with loss count `0` if not already present.
- Increment each loser's loss count, then collect players with `0` and `1` losses into the two answer lists.

## Why It Works

- Every player who appears in any match is inserted into the map, either as a winner or loser.
- Winners are not given extra losses, while each losing occurrence increments that player's count once.
- Iterating the `TreeMap` visits players in increasing order, so both output lists are sorted.
- Adding only counts `0` and `1` matches the two categories requested.

## Edge Cases

- Players who only win remain at loss count `0`.
- Players with two or more losses are present in the map but skipped.

## Complexity

- Time: $O(m \log p)$, where `m` is the number of matches and `p` is the number of distinct players.
- Space: $O(p)$.
