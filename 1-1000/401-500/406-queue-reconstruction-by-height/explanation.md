# Explanation

Problem: [Queue Reconstruction by Height](https://leetcode.com/problems/queue-reconstruction-by-height/)

## Idea

- Sort people by descending height.
- For equal heights, sort by ascending `k`.
- Insert each person into a list at index `k`.
- Convert the list back to a 2D array.

## Why It Works

- When processing a person, all already-inserted people are at least as tall because of the descending height sort.
- Inserting at index `k` places exactly `k` taller-or-equal people before that person.
- Later inserted people are shorter, so they do not affect the `k` count of anyone already placed.
- Sorting equal heights by ascending `k` ensures equal-height people are inserted in a valid order.

## Edge Cases

- People with `k = 0` can be inserted at the front.
- Duplicate heights are handled by the secondary sort.

## Complexity

- Time: $O(n^2)$ because list insertion can shift elements.
- Space: $O(n)$.

## Notes

- The implementation uses `ArrayList` insertion at `p[1]`, matching the standard greedy construction.
