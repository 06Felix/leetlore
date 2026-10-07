# Explanation

## Idea
- Process elements from left to right, using the previously modified value as the lower bound.
- Search downward for the largest prime at most `current - previous - 1`, using trial division for primality.
- Subtract that prime if it exists; reject if the resulting element does not exceed its predecessor.

## Why It Works
- The prime bound makes the adjusted value strictly greater than the previous value and ensures the prime is smaller than the original element.
- Choosing the largest allowed prime minimizes the current adjusted value, leaving the most room for future elements.
- If even this smallest feasible choice cannot maintain increasing order, larger earlier choices cannot help; otherwise the greedy choice preserves every possible continuation.

## Edge Cases
- No available prime leaves the element unchanged; values one and two therefore may remain as they are.
- Strict inequalities prohibit ties, and each element is modified at most once.

## Complexity
- Time: $O(nM\sqrt{M})$ as a conservative bound for scanning candidates and trial division, where $M \le 1000$.
- Auxiliary space: $O(1)$.

## Notes
- The input array is modified in place, including changes made before an eventual false result.
- `isPrime` is not a general predicate for zero or one, but the range helper avoids testing them: ranges ending at one are rejected and any downward scan starting above one encounters prime two first.
