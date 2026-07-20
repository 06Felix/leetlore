# Explanation

Problem: [Last Person to Fit in the Bus](https://leetcode.com/problems/last-person-to-fit-in-the-bus/)

## Idea

Compute each person's running total weight in boarding order. Among rows whose running total is at most `1000`, return the row with the largest running total.

## Why It Works

`SUM(weight) OVER (ORDER BY turn)` gives the total bus weight after each person boards in queue order. A person can board exactly when that running total is within the bus limit. The last person who fits is therefore the valid row farthest along the queue, which also has the largest accumulated weight under positive weights. Ordering valid rows by `accumulated_weight DESC` and taking one row returns that person.

## Edge Cases

- The first person is guaranteed to fit, so the result is never empty.
- Positive weights make accumulated weight strictly increase with turn.

## Complexity

- Time: `O(n log n)` for the window ordering.
- Space: `O(n)` for window results.
