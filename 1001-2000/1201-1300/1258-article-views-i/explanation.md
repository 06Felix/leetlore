# Explanation

Problem: [Article Views I](https://leetcode.com/problems/article-views-i/)

## Idea

Filter views where the author and viewer are the same person. Return each matching author once, sorted by id.

## Why It Works

`author_id = viewer_id` is exactly the condition for an author viewing their own article. `DISTINCT` removes duplicates from multiple self-views or duplicate rows. Aliasing `author_id AS id` gives the required output column, and `ORDER BY 1` sorts by that id in ascending order.

## Edge Cases

- Duplicate self-view rows still produce one author id.
- Authors who never viewed their own article are filtered out.

## Complexity

- Time: `O(n log n)` due to distinct/order work in the general case.
- Space: `O(n)` for duplicate elimination and sorting.
