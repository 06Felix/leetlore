# Explanation

Problem: [Remove Nodes From Linked List](https://leetcode.com/problems/remove-nodes-from-linked-list/)

## Idea

Process the list recursively from right to left. After the suffix is cleaned, decide whether the current node should stay by comparing it with the first remaining node to its right.

## Why It Works

The recursive call `removeNodes(head.next)` returns a suffix where every kept node has no greater value to its right. If the current value is smaller than the new suffix head, then there is a greater value to its right, so the current node must be removed and the suffix head is returned. Otherwise the current node is at least as large as every kept node in the cleaned suffix, so it remains valid and is linked to that suffix.

## Edge Cases

- `null` returns `null`, which ends the recursion.
- Equal values are kept because the problem removes only nodes with a strictly greater value to the right.

## Complexity

- Time: `O(n)`.
- Space: `O(n)` recursion stack.

## Notes

The logic is concise, but Java recursion can overflow the call stack for a very long list near the `100000` node constraint.
