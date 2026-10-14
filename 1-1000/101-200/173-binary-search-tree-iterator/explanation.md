## Idea

- Recursively traverse the BST in order during construction, storing every value in a queue. next polls its front; hasNext checks whether the queue is empty.

## Why It Works

- BST inorder traversal produces values in ascending order. Preloading that sequence and removing its front once per next call gives exactly the iterator order.

## Edge Cases

- next is guaranteed valid; the final poll leaves hasNext false.

## Complexity

- O(n) construction, O(1) next/hasNext, O(n) queue space and O(h) construction stack.

## Notes

- This does not meet the optional O(h)-memory follow-up. A skewed 100000-node tree may overflow the recursive construction stack.
