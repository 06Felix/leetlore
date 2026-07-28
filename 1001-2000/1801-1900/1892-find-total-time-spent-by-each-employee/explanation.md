# Explanation

## Idea

Group rows by employee and day, then sum each interval length.

The query aliases `event_day` as `day` and computes `SUM(out_time - in_time)` as `total_time`.

## Why It Works

Each row contributes exactly the minutes spent during one office visit. Grouping by `event_day` and `emp_id` combines all visits for the same employee on the same day.

The problem allows any output order, so no `ORDER BY` is needed.

## Edge Cases

- Multiple visits on the same day are added together.
- Single-visit days are returned with that one duration.
- Non-overlap is guaranteed, so no interval merging is needed.

## Complexity

Time: `O(R)` logical scan/aggregation over table rows, plus database grouping cost.

Space: `O(G)` for grouped results.
