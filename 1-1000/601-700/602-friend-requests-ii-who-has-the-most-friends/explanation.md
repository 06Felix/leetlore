# Explanation

Problem: [Friend Requests II: Who Has the Most Friends](https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/)

## Idea

Treat every accepted request as contributing one friend to both the requester and accepter. Union both id columns, count appearances per id, and return the largest count.

## Why It Works

For an accepted friendship between `requester_id` and `accepter_id`, each person gains one friend. The CTE emits both ids once for every accepted request. Grouping by `id` therefore counts the total number of friends for each person. Ordering by the count descending and taking one row returns the unique person with the most friends, as guaranteed by the test cases.

## Edge Cases

- Users can appear only as requester or only as accepter and are still counted.
- The imported query returns one max row; the problem guarantees the maximum is unique.

## Complexity

- Time: `O(n log n)` for grouping and ordering.
- Space: `O(n)` for the unioned id list.
