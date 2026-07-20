# Explanation

Problem: [Game Play Analysis IV](https://leetcode.com/problems/game-play-analysis-iv/)

## Idea

Find each player's first login date in a subquery. Join that result back to all activity rows, count players who have an activity exactly one day after their first login, and divide by the number of players.

## Why It Works

The subquery computes `MIN(event_date)` per player, which is the initial login. After joining back, `DATEDIFF(t1.event_date, t2.first_event) = 1` is true exactly for a login on the next calendar day. Summing that condition counts players with next-day activity, and `COUNT(DISTINCT t1.player_id)` counts all players. Rounding the quotient gives the requested fraction.

## Edge Cases

- Players with no next-day login contribute `0` to the numerator.
- The primary key prevents duplicate activity rows for the same player and date.

## Complexity

- Time: `O(n)` grouping and join work with indexing, otherwise database-dependent.
- Space: `O(p)` for one first-login row per player.
