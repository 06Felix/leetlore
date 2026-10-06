# Explanation

## Idea
- Recursively compare the roots, rejecting different values or mismatched null nodes.
- Matching roots are equivalent if their children match either across swapped sides or on their original sides.

## Why It Works
- A flip changes only which side contains each child subtree, so these two pairings cover every choice at the current root.
- Applying the same test recursively checks that the selected child subtrees can be made equal.
- Two null nodes are equivalent; one null and one non-null node cannot become equal by flips.

## Edge Cases
- Two empty trees return true; only one empty tree returns false.
- Leaves and one-child nodes follow the same recursive pairings without changing either input tree.

## Complexity
- Time: $O(n_1 + n_2)$ under the unique-value constraint, since a non-null value can match only one node in the other tree and wrong pairings reject immediately.
- Auxiliary space: $O(h_1 + h_2)$ as a bound on recursive comparison depth.

## Notes
- The linear-time bound relies on unique values; repeated values outside the stated constraints could require exploring many alternative pairings.
