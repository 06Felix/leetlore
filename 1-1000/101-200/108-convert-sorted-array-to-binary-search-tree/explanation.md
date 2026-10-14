## Idea

- Choose the midpoint of each sorted index range as a node and recursively build its left and right halves.

## Why It Works

- All left-half values are smaller and right-half values larger, preserving BST order. Midpoint splitting keeps child sizes within one, recursively producing subtrees with heights differing by at most one.

## Edge Cases

- Empty ranges return null and singleton ranges create leaves. Either midpoint choice is valid for an even-sized range.

## Complexity

- O(n) time and O(log n) auxiliary recursion space, plus O(n) returned tree space.
