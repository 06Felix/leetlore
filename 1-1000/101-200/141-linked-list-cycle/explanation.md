# Linked List Cycle

## Idea
- Move a slow pointer one node and a fast pointer two nodes on every iteration.
- Return `true` when they reference the same node after moving; return `false` when the fast pointer reaches the list end.

## Why It Works
- Without a cycle, the fast pointer eventually reaches `null`, terminating the scan.
- Inside a cycle, the fast pointer gains one position per iteration relative to the slow pointer, so their positions must coincide within one cycle length.

## Edge Cases
- Empty lists and single nodes without a self-loop return `false` safely.
- A self-loop or a cycle starting at the head is detected using node identity, independently of repeated values.

## Complexity
- $O(n)$ time over reachable nodes and $O(1)$ auxiliary space.
- No links or node values are modified.
