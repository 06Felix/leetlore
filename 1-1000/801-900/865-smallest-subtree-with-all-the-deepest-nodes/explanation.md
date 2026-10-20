# Smallest Subtree with all the Deepest Nodes

## Idea

- Use postorder recursion returning a pair: subtree height and the smallest node containing that subtree’s deepest nodes. Propagate the candidate from the taller child; when heights tie, return the current node.

## Why It Works

- If one child is taller, all deepest descendants lie within it and its candidate remains minimal. Equal child heights place deepest nodes in both sides, making the current node their lowest common ancestor. This inductive rule reaches the desired subtree at the root.

## Edge Cases

- A null child has height zero. A leaf returns itself; a chain returns its deepest leaf.

## Complexity

- O(N) time and O(H) live recursion space for N nodes and height H, with O(N) total record allocations.

## Notes

- The algorithm returns an existing tree node and does not modify the tree. The helper record requires a Java version supporting records.
