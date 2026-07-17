# Explanation

## Idea

- Group rows in `Activity` by `player_id`.
- For each player, return the minimum `event_date` as `first_login`.

## Why It Works

- The first login date is exactly the earliest activity date for that player.
- `MIN(event_date)` computes that earliest date within each grouped player partition.
- The query does not need `device_id` or `games_played` because they do not affect first-login selection.

## Edge Cases

- Players with one row return that row's date.
- Multiple rows on different dates collapse to the earliest date.
- Output order is unrestricted, so no `ORDER BY` is needed.

## Complexity

- Time: $O(n)$ logical scan/grouping over the table rows, subject to database execution plan.
- Space: $O(p)$ for grouped players, subject to database execution plan.
