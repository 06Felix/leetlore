# Explanation

## Idea
- Scan the digits from right to left, tracking the largest suffix digit and its rightmost position.
- Record a swap candidate only when that suffix maximum is strictly larger than the current digit.
- Swap at the first position with such a candidate, then reconstruct the integer.

## Why It Works
- Improving the earliest possible digit dominates every improvement at a later position.
- Using the largest available later digit maximizes that earliest improvement.
- Keeping the rightmost occurrence among equal maximum digits moves the smaller displaced digit farthest right, maximizing the remaining suffix.

## Edge Cases
- Zero, one-digit numbers, and already maximal digit orders require no swap.
- Repeated maximum digits retain their rightmost occurrence; the swap cannot introduce a leading zero because it replaces a digit with a strictly larger one.

## Complexity
- Time: $O(d)$ for `d` decimal digits.
- Auxiliary space: $O(d)$ for the digit and candidate-index arrays.
