# Explanation

Problem: [Exchange Seats](https://leetcode.com/problems/exchange-seats/)

## Idea

Compute each student's new `id` with a `CASE`: odd ids move to the next id, even ids move to the previous id, and the last odd id stays unchanged.

## Why It Works

Seats are continuous from `1` to `n`, so consecutive pairs are `(1,2)`, `(3,4)`, and so on. For every odd id that has a partner, adding `1` swaps it with the next seat. For every even id, subtracting `1` swaps it with the previous seat. If the maximum id is odd, that last student has no partner, so the query keeps the id unchanged. Ordering by the computed id returns the final seating order.

## Edge Cases

- Odd number of rows keeps the last row in place.
- Even number of rows swaps every row with its pair.

## Complexity

- Time: `O(n log n)` due to ordering, plus the max-id lookup.
- Space: `O(n)` for the ordered result.
