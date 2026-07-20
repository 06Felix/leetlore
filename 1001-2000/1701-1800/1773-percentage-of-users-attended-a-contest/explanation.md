# Explanation

Problem: [Percentage of Users Attended a Contest](https://leetcode.com/problems/percentage-of-users-attended-a-contest/)

## Idea

Count registrations per contest and divide each count by the total number of users. Sort by percentage descending and contest id ascending.

## Why It Works

Each row in `Register` represents one user registered for one contest, and the table key prevents duplicate registrations for the same contest-user pair. Grouping by `contest_id` gives the number of registered users for that contest. The scalar subquery counts all users, so `COUNT(user_id) * 100 / totalUsers` is the required percentage. The `ORDER BY` clause matches the requested tie-breaking.

## Edge Cases

- Contests with one registration are handled by the same formula.
- The query returns contests present in `Register`; contests with no registrations have no row to report.

## Complexity

- Time: `O(r + u)` in a typical grouped execution plan.
- Space: `O(c)` for contest groups.
