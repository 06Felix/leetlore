# Explanation

Problem: [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/)

## Idea

- Walk pointer `a` through list A, then list B.
- Walk pointer `b` through list B, then list A.
- Stop when both pointers reference the same node.
- That shared reference is either the intersection node or `null`.

## Why It Works

- If the lists intersect, both pointers traverse the same total length before the shared tail: `lenA + lenB`.
- Switching heads cancels the difference in prefix lengths between the two lists.
- Once aligned at the shared tail, both pointers move together and meet at the first common node.
- If there is no intersection, both pointers become `null` after traversing both lists.

## Edge Cases

- If either head is `null`, the loop naturally converges to `null`.
- Intersection at the head is detected immediately or after aligned traversal.

## Complexity

- Time: $O(m + n)$.
- Space: $O(1)$.

## Notes

- The comparison is by node reference, not by node value.
