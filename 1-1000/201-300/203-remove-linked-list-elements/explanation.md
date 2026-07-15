# Explanation

Problem: [Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)

## Idea

- Use recursion to process the list from the head onward.
- If the current node matches `val`, skip it by returning the recursive result for `head.next`.
- Otherwise, recursively clean the rest of the list, attach it back to `head.next`, and return `head`.

## Why It Works

- The base case returns `null` for an empty suffix.
- When a node has the target value, excluding it and returning the cleaned suffix removes exactly that node.
- When a node should stay, assigning `head.next` to the cleaned suffix removes target nodes after it while preserving the current node.
- By induction over the list suffix, the returned head points to the original list with all target-valued nodes removed.

## Edge Cases

- Empty list returns `null`.
- Matching nodes at the original head are skipped until the first kept node or the end.
- A list where every node matches returns `null`.

## Complexity

- Time: $O(n)$, where `n` is the number of nodes.
- Space: $O(n)$ recursion stack in the worst case.
