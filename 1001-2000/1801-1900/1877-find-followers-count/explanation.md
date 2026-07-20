# Explanation

Problem: [Find Followers Count](https://leetcode.com/problems/find-followers-count/)

## Idea

Group the `Followers` table by `user_id` and count the follower rows in each group.

## Why It Works

Each row represents one follower relationship for a user. Because `(user_id, follower_id)` is the primary key, each follower is counted at most once per user. Grouping by `user_id` collects all followers for that user, and `COUNT(follower_id)` returns the follower count. Ordering by `user_id` satisfies the required output order.

## Edge Cases

- Users with one follower return count `1`.
- Only users present in `Followers` are returned, matching the problem statement.

## Complexity

- Time: `O(n log n)` in the general case due to grouping and ordering.
- Space: `O(u)` for user groups.
