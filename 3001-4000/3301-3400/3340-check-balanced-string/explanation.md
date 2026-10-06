# Explanation

## Idea
- Convert the digit string to a character array and accumulate separate totals for even and odd zero-based indices.
- Convert each character to its numeric digit by subtracting `'0'`, then compare the totals.

## Why It Works
- Every index belongs to exactly one parity group, so each digit contributes once to the required total.
- Equality of those two totals is exactly the balanced-string condition.

## Edge Cases
- Leading zeros contribute zero and need no special treatment.
- Odd-length strings have one extra even-indexed digit, but the comparison rule is unchanged.

## Complexity
- Time: $O(n)$.
- Auxiliary space: $O(n)$ because the implementation calls `toCharArray()`; its counters otherwise use $O(1)$.
