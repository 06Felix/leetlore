# Next Greater Node In Linked List

## Idea

- Scan the list while keeping unresolved indices on a monotone stack. Store each new node value in ans; when it exceeds an unresolved stored value, overwrite that entry with the new value and pop it. Replace still-unresolved entries with zero after the scan.

## Why It Works

- An index on the stack still stores its original value and has seen no greater successor. The first larger current node is exactly its next greater node. Popped entries no longer participate in comparisons, so overwriting resolved values cannot corrupt later searches.

## Edge Cases

- Equal values do not resolve each other. Nodes with no greater successor become zero at the end.

## Complexity

- O(n) time and O(n) auxiliary space for the dynamic answer list and stack, plus the returned primitive array.

## Notes

- The input list is unchanged. Each node index is pushed and popped at most once; ans temporarily mixes original unresolved values with final resolved answers.
