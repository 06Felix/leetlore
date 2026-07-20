# Explanation

Problem: [Confirmation Rate](https://leetcode.com/problems/confirmation-rate/)

## Idea

Left join all signups to confirmation attempts, then average whether each attempt was confirmed for every user.

## Why It Works

The left join keeps every signed-up user, including users with no confirmation rows. In MySQL, `Confirmations.action = 'confirmed'` evaluates to `1` for confirmed attempts and `0` for timeout attempts, so `AVG(...)` is the user's confirmed-attempt fraction. If a user has no attempts, the average is `NULL`, and `IFNULL(..., 0)` returns the required confirmation rate of `0`.

## Edge Cases

- Users with only timeouts get rate `0.00`.
- Users with no confirmation requests are still returned.
- `ROUND(..., 2)` matches the requested precision.

## Complexity

- Time: `O(s + c)` with normal join indexing, otherwise database-dependent.
- Space: `O(u)` for user groups.
