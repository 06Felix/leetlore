# Explanation

## Idea

Count the list length, then split it into `k` consecutive parts.

Each part gets `length / k` nodes, and the first `length % k` parts get one extra node.

## Why It Works

This distribution keeps part sizes as equal as possible, with earlier parts greater than or equal to later parts.

The loop records the head of each part, advances by that part's size, and cuts the link by setting the previous node's `next` to null.

## Edge Cases

- If `k` is larger than the list length, later parts are null.
- An empty input list returns all null parts.
- The original list nodes are reused and relinked.

## Complexity

Time: `O(n + k)`.

Space: `O(k)` for the returned array.
