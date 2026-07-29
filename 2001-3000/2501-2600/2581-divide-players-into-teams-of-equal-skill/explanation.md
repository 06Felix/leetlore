# Explanation

## Idea

- Sort the skills.
- Pair the smallest remaining player with the largest remaining player.
- Use the first mirrored pair to define the required team sum.
- If every mirrored pair has that sum, add each pair product; otherwise return `-1`.

## Why It Works

- In any valid split, the smallest remaining skill must pair with a skill that reaches the common sum.
- After sorting, pairing the smallest with anything other than the largest would leave the largest unable to match the same sum.
- Repeating this from both ends proves mirrored sorted pairs are forced when a valid split exists.
- The implementation checks each forced pair and accumulates its chemistry once.

## Edge Cases

- Two players form the initial pair and return immediately after the loop.
- Duplicate skill values are handled naturally by sorting.
- The first mismatched pair sum proves equal-sum teams are impossible.

## Complexity

- Time: `O(n log n)` from sorting.
- Space: `O(log n)` to `O(n)`, depending on Java sort internals.
