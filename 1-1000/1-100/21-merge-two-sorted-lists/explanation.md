# Merge Two Sorted Lists

## Idea
- Use a dummy head and an output tail. Repeatedly select the smaller available input value and copy it into a newly allocated node.
- Advance only the selected input pointer, continuing until both lists are exhausted, then return the dummy's successor.

## Why It Works
- The smallest remaining value must be at one of the two sorted input heads, so each appended value preserves sorted order.
- Every iteration consumes exactly one input node's value; termination therefore includes every value exactly once.

## Edge Cases
- Two empty inputs return `null`; one empty input causes every value from the other to be copied.
- Equal values are taken from `list2` first, preserving multiplicities.

## Complexity
- $O(m+n)$ time and $O(m+n)$ newly allocated output space, plus one dummy node.
- The original nodes and links are unchanged; the implementation does not perform an in-place merge.

## Notes
- Restriction violation: the statement requires splicing together the original nodes. This implementation instead creates new nodes, so its values are correct but node reuse does not satisfy that requirement.
