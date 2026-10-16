# Tree Node

## Idea

- LEFT JOIN each Tree node to its children. Classify a NULL-parent node as Root, a node with no joined child as Leaf, and every other node as Inner. Use DISTINCT to remove repeated parent rows.

## Why It Works

- The self-join produces a child match exactly when a node has children. Checking root status first handles the special single-node tree; the remaining match/no-match cases are exactly inner and leaf nodes.

## Edge Cases

- A root with no children is still Root. Multiple children create duplicate classifications that DISTINCT collapses.

## Complexity

- Plan-dependent: a p_id index or hash join supports roughly O(N + J) join work before deduplication, for N nodes and J joined rows; an unindexed nested loop can cost O(N^2).

## Notes

- DISTINCT applies to the selected id/type row, not merely an expression-level id operation. The original query passed a SQLite fixture; MySQL was not executed.
