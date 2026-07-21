# Delete Nodes And Return Forest

## Idea

- Store values to delete in a set.
- DFS returns the subtree root after deletions, or `null` if the current node is deleted.
- Track whether the current node is a potential root.
- Add a node to the answer when it is a root candidate and is not deleted.

## Why It Works

- The original root is a root candidate.
- Children of a deleted node become new root candidates.
- Returning `null` for deleted nodes disconnects them from their parent.
- Reassigning `left` and `right` to DFS results removes deleted descendants from kept trees.

## Edge Cases

- Deleting the original root can promote its non-deleted children.
- Deleting a leaf just removes that leaf.
- If no nodes are deleted, only the original root is returned.

## Complexity

- Time: $O(n + d)$ for nodes and delete-list length.
- Space: $O(d + h)$ for delete set and recursion stack.
