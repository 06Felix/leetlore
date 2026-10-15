# Delete Columns to Make Sorted II

## Idea

- Process columns left to right and track adjacent row pairs already strictly ordered by retained columns. Delete a column if it reverses any unresolved pair; otherwise retain it and mark newly ordered pairs.

## Why It Works

- For an unresolved pair, the retained prefix is equal, so a decreasing next character would permanently violate lexicographic order and forces deletion. A safe column can only resolve more pairs, never harm an already ordered pair, so retaining it is optimal.

## Edge Cases

- Equal characters leave a pair unresolved. Once a pair is strictly ordered, later columns cannot reverse its overall string order. One row needs no deletions.

## Complexity

- O(rows * cols) time and O(rows) auxiliary space.

## Notes

- Only retained columns update sorted flags; a rejected column changes no ordering state. The input strings are unchanged.
