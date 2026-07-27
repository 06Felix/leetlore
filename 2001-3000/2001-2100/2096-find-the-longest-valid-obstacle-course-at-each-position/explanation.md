# Explanation

## Idea

The solution is a nondecreasing LIS variant. It keeps `tail[len - 1]` as the smallest possible ending obstacle value for a nondecreasing obstacle course of length `len`.

For each obstacle, it either extends the current longest course or replaces the first tail value greater than the obstacle.

## Why It Works

For a nondecreasing course, an obstacle can follow any tail value that is less than or equal to it. If the obstacle is at least the last tail, it extends the longest course.

Otherwise, replacing the first value greater than the obstacle keeps the same course length but lowers the ending value, which can only help future obstacles. The replacement index plus one is exactly the longest valid course length ending at the current position.

## Edge Cases

- Equal values are allowed, so the binary search finds the first value strictly greater than the target.
- A strictly decreasing sequence always replaces index `0`, giving length `1` for each position.
- A nondecreasing sequence keeps appending and grows by one each time.

## Complexity

Time: `O(n log n)`.

Space: `O(n)`.
