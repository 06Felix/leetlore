# Explanation

Problem: [Count Number of Teams](https://leetcode.com/problems/count-number-of-teams/)

## Idea

- Treat each index `i` as the middle soldier of a team.
- Count smaller and larger ratings on the left of `i`.
- Count smaller and larger ratings on the right of `i`.
- Add increasing teams `leftLess * rightGreater` and decreasing teams `leftGreater * rightLess`.

## Why It Works

- Every valid team has exactly one middle index.
- For an increasing team centered at `i`, the left rating must be smaller and the right rating must be larger.
- For a decreasing team centered at `i`, the left rating must be larger and the right rating must be smaller.
- Multiplying the compatible left and right counts gives all teams with middle `i`, and summing over all middles counts each team once.

## Edge Cases

- Strict comparisons match the unique-rating constraint.
- Arrays of length `3` work because the only possible middle is checked.

## Complexity

- Time: $O(n^2)$.
- Space: $O(1)$.

## Notes

- The implementation uses direct counting instead of Fenwick trees, which is sufficient for `n <= 1000`.
