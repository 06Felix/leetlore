# Delete Nodes From Linked List Present in Array

## Idea

- Store nums in a HashSet and add a dummy node before head. From each retained predecessor, repeatedly bypass matching successor nodes, then advance to the next retained node.

## Why It Works

- Bypassing removes exactly forbidden values while preserving the order of all remaining nodes. The dummy predecessor handles removals at the original head with the same logic; repeated bypasses handle consecutive deletions.

## Edge Cases

- Leading, trailing, and consecutive matching nodes are removed. The statement guarantees at least one node survives.

## Complexity

- Expected O(a + l) time and O(a) auxiliary space for a array values and l list nodes.

## Notes

- The implementation changes next pointers in the supplied list and allocates only one dummy node besides the set.
