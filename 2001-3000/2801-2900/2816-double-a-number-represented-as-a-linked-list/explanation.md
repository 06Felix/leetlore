# Explanation

## Idea
- Recurse to the end of the digit list and return carries toward the head.
- For each node, combine twice its original digit with the carry from its successor, store the result modulo ten, and return the quotient by ten.
- Prepend a new digit one only when the head produces a carry.

## Why It Works
- Unwinding recursion processes digits from least significant to most significant, matching ordinary decimal multiplication.
- Every digit receives exactly the carry produced by the suffix on its right.
- A final carry represents one new most-significant digit and is preserved by the prepended node.

## Edge Cases
- Zero remains zero; a leading digit of at least five can create an extra head node.
- Chains of nines propagate carries correctly, and the nonempty-input guarantee makes the first helper call safe.

## Complexity
- Time: $O(n)$ for `n` digits.
- Auxiliary space: $O(n)$ for recursion; at most one new list node is allocated.

## Notes
- Existing digit nodes are modified in place. A list near the 10000-node limit can exceed available Java recursion stack capacity.
