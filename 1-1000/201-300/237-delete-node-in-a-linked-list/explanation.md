# Explanation

Problem: [Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/)

## Idea

The implementation cannot access the previous node, so it makes the current node look like the next node and then skips that next node.

## Why It Works

The target node is guaranteed not to be the tail, so `node.next` always exists. Copying `node.next.val` into `node.val` removes the original target value from the visible list. Updating `node.next` to `node.next.next` bypasses the next physical node, reducing the list length by one while preserving the order of all remaining values.

## Edge Cases

- Works for deleting the second-to-last node because `node.next.next` may be `null`.
- The tail case is excluded by the problem, so no separate handling is needed.

## Complexity

- Time: `O(1)`.
- Space: `O(1)`.
