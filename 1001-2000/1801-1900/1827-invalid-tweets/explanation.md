# Explanation

Problem: [Invalid Tweets](https://leetcode.com/problems/invalid-tweets/)

## Idea

Select tweet ids whose content length is greater than `15`.

## Why It Works

The problem defines an invalid tweet as one with strictly more than `15` characters. `LENGTH(content) > 15` applies exactly that condition, so every returned `tweet_id` belongs to an invalid tweet and every invalid tweet is included.

## Edge Cases

- Content length exactly `15` is valid and excluded.
- Output order is unrestricted, so no ordering is required.

## Complexity

- Time: `O(n * l)`, where `l` is the content length checked per row.
- Space: `O(1)` auxiliary query state, excluding result rows.
