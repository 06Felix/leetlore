# Explanation

Problem: [Rising Temperature](https://leetcode.com/problems/rising-temperature/)

## Idea

Self-join `Weather` so each row `t` is paired with the row for the previous calendar day `y`. Return `t.id` when today's temperature is higher.

## Why It Works

`DATE_SUB(t.recordDate, INTERVAL 1 DAY) = y.recordDate` matches each date with exactly yesterday's record. The `WHERE` clause keeps only pairs where `t.temperature > y.temperature`, which is exactly the condition requested by the problem. Dates without a previous-day row are excluded by the inner join.

## Edge Cases

- Missing previous-day records are not returned.
- Output order is unrestricted, so no `ORDER BY` is needed.

## Complexity

- Time: `O(n^2)` without indexes, though a database can optimize the date lookup with indexing.
- Space: `O(1)` auxiliary query state, excluding result rows.
