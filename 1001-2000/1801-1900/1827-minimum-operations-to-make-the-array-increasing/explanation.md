# Explanation

## Idea
- Scan from the second element, tracking the previous adjusted value.
- If the current value is not larger, raise it to `previous + 1` and add the required increments to the answer.

## Why It Works
- Once the preceding prefix is fixed, strict increase forces the next value to be at least `previous + 1`.
- Choosing the smallest permissible value minimizes its own increments and makes the lower bound for every later element as small as possible. Induction gives the minimum total cost.

## Edge Cases
- A singleton or an already increasing array requires zero operations.
- Equal and descending values are raised just enough to exceed their adjusted predecessor.

## Complexity
- Time: $O(n)$ for one pass.
- Auxiliary space: $O(1)$.

## Notes
- The implementation updates the input array in place while computing the count.
