# Explanation

Problem: [Big Countries](https://leetcode.com/problems/big-countries/)

## Idea

Filter `World` to countries whose `area` is at least `3000000` or whose `population` is at least `25000000`, then select the requested columns.

## Why It Works

The problem defines a big country using an OR between the area and population thresholds. The `WHERE` clause applies exactly that predicate, so every returned row is big and every big country is included. The projection returns only `name`, `population`, and `area`.

## Edge Cases

- Countries meeting either threshold are included.
- Countries exactly on a threshold are included because the comparisons use `>=`.

## Complexity

- Time: `O(n)` rows scanned.
- Space: `O(1)` auxiliary query state, excluding result rows.
