# Explanation

Problem: [Average Time of Process per Machine](https://leetcode.com/problems/average-time-of-process-per-machine/)

## Idea

Join each process's `start` row with its `end` row using `(machine_id, process_id)`. Average `end.timestamp - start.timestamp` per machine and round to three decimals.

## Why It Works

Each `(machine_id, process_id)` has exactly one start and one end row. The self-join pairs those two rows for the same process on the same machine, and the `WHERE` clause assigns `SA` to the start row and `EA` to the end row. Their timestamp difference is that process's duration. `AVG` over each `machine_id` gives the machine's average processing time.

## Edge Cases

- Equal start and end timestamps contribute duration `0`.
- `ROUND(..., 3)` matches the requested precision.

## Complexity

- Time: `O(n)` with indexing on `(machine_id, process_id)`, otherwise database-dependent.
- Space: `O(m)` for machine groups.
