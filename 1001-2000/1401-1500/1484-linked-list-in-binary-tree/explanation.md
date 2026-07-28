# Explanation

## Idea

Try every tree node as a possible start of the linked-list path. For each start, recursively check whether the list matches a downward path.

## Why It Works

`isSubPath` searches the whole tree by recursively moving to left and right children as new starting points.

`check` verifies one candidate path: if the current list node is null, the whole list matched; if the tree node is null or values differ, that path fails. Otherwise it continues with the next list node down either child.

Together, these cover every downward path in the tree.

## Edge Cases

- A missing tree node cannot match a remaining list node.
- The list may start below the root.
- Duplicate values are handled because all possible starts and branches are tried.

## Complexity

Time: `O(T * L)` worst case, where `T` is tree nodes and `L` is list length.

Space: `O(H + L)` recursion stack in the worst case.
