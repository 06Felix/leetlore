# Top Travellers

## Idea

- Start from `Users` and left join their matching rides.
- Sum each user's ride distances.
- Use `IFNULL` so users with no rides show distance `0`.
- Sort by total distance descending, then by name ascending.

## Why It Works

- The left join preserves every user, including those without matching rows in `Rides`.
- Grouping by user id aggregates all rides for the same user.
- `SUM(R.distance)` gives the travelled distance for users with rides, and `IFNULL` converts the no-ride aggregate to `0`.
- The `ORDER BY` clause matches the required ranking and tie-breaker.

## Edge Cases

- Users with no rides are included with `0`.
- Multiple rides for the same user are summed together.
- Ties in distance are resolved alphabetically by `name`.

## Complexity

- Time: depends on the database join, grouping, and sort plan.
- Space: depends on the database execution plan for aggregation and ordering.
