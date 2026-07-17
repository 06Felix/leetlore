# Explanation

## Idea

- Use recursive preorder traversal.
- Add the current node value before recursively visiting children.
- Store visited values in the shared `ans` list.

## Why It Works

- Preorder for an N-ary tree is current node first, then children from left to right.
- The loop over `t.children` preserves the given child order.
- Each recursive call appends values for one subtree before moving to the next sibling.

## Edge Cases

- A null root returns an empty list.
- Deep trees rely on recursion depth, bounded by the statement.

## Complexity

- Time: $O(n)$ when every node is traversed.
- Space: $O(n)$ for the answer plus $O(h)$ recursion stack.

## Notes

- The implementation returns immediately when `t.children == null`, before adding `t.val`. It is correct when leaf nodes have an empty children list, as LeetCode usually provides, but would skip nodes whose `children` field is actually `null`.
