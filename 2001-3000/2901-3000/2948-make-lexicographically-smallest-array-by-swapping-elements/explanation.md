# Explanation

## Idea
- Sort value/index pairs and group consecutive sorted values whose gaps are at most `limit`.
- Record each original index's group and store that group's values in ascending order in a deque.
- Fill output indices left to right by taking their group's smallest remaining value.

## Why It Works
- Allowed swaps connect values exactly within these gap-linked components. Swaps along connecting links permit arbitrary permutations within a component, while a gap above the limit prevents movement between components.
- Each position must receive a value from its component. Assigning the smallest available value at the earliest position minimizes the array lexicographically.

## Edge Cases
- Equal values remain in one group.
- Isolated components retain their sole values; a chain of small gaps can connect endpoints farther apart than `limit`.

## Complexity
- Time: $O(n\log n)$ for sorting, followed by linear grouping and assignment.
- Auxiliary space: $O(n)$ for pairs, groups, deques, and the result.
