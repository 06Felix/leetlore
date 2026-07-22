# Explanation

Problem: [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/)

## Idea

- Use Floyd's slow/fast pointers to detect whether a cycle exists.
- Move `slow` by one node and `fast` by two nodes.
- When they meet, reset `slow` to `head`.
- Move both pointers one step at a time; their next meeting point is the cycle entry.

## Why It Works

- If there is no cycle, `fast` eventually reaches `null`, so the method returns `null`.
- If there is a cycle, slow and fast must meet inside it because fast gains one node per iteration modulo the cycle length.
- After the first meeting, the distance from `head` to the cycle entry equals the distance from the meeting point to the entry along the cycle.
- Moving both pointers one step at a time therefore makes them meet exactly at the cycle start.

## Edge Cases

- Empty lists and one-node acyclic lists return `null`.
- A cycle beginning at the head is handled by the reset phase.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.

## Notes

- The linked list is not modified.
