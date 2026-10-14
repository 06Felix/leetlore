## Idea

- Traverse in order, count visited nodes, and store the value when the count reaches k.

## Why It Works

- Inorder traversal of a BST yields sorted values, making its kth visit exactly the kth smallest element. The stored answer remains unchanged after that visit because the count only increases.

## Edge Cases

- k is guaranteed valid. Returning at the matching call does not stop all ancestor calls from exploring other subtrees.

## Complexity

- O(n) worst-case time and O(h) recursion space.

## Notes

- The implementation does not globally stop after finding the answer. Instance fields ct and ans are not reset between calls, so object reuse can return stale results; deep recursion can also overflow the runtime stack.
