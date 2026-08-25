# Smallest Missing Multiple of K

## Idea

- Store every value from `nums` in a set.
- Check positive multiples of `k` in increasing order: `k`, `2k`, `3k`, and so on.
- The first multiple that is not present in the set is the answer.

## Why It Works

- All positive multiples of `k` appear in strictly increasing order when we keep adding `k`.
- The problem asks for the smallest missing one, so the first absent multiple found by this scan must be optimal.
- A set gives constant-time membership checks for each candidate multiple.

## Edge Cases

- If `k` itself is missing, return `k`.
- If several early multiples are present, keep moving to the next multiple.
- Duplicate values in `nums`, if any, do not affect the result because membership is all that matters.

## Complexity

- Time: `O(n + m)`, where `m` is the number of present multiples checked before the missing one.
- Space: `O(n)`

## Tags

- Hash Table
- Math
- Simulation
