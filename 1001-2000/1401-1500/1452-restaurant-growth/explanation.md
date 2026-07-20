# Explanation

Problem: [Restaurant Growth](https://leetcode.com/problems/restaurant-growth/)

## Idea

Build the set of dates that have at least six previous days. For each such date, join all customer rows from that date through six days earlier and aggregate the seven-day total and average.

## Why It Works

The first six dates cannot produce a full seven-day window, so the CTE starts at `MIN(visited_on) + 6 days`. For each output date, the join condition `DATEDIFF(Dates.visited_on, Customer.visited_on) BETWEEN 0 AND 6` selects exactly the current day and the six preceding days. Summing `amount` gives the seven-day total, and dividing by `7` gives the moving average requested by the problem.

## Edge Cases

- Multiple customers on the same day are all included in that day's contribution.
- The table guarantees at least one customer every day, so each seven-day date range is complete.

## Complexity

- Time: `O(d * n)` without date indexing, where `d` is output dates and `n` is customer rows.
- Space: `O(d)` for the date CTE.
