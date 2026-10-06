# Explanation

## Idea
- Find the minimum element and sum all elements in one pass.
- Return $\sum nums - n \cdot \min(nums)$.

## Why It Works
- Incrementing every element except one has the same effect on relative differences as decrementing that excluded element.
- In this equivalent process, the largest attainable common target is the original minimum; lowering the target further only adds moves.
- Each element therefore contributes its distance above the minimum.

## Edge Cases
- An already equal array, including one element, needs zero moves.
- Negative values obey the same difference formula.

## Complexity
- Time: $O(n)$.
- Auxiliary space: $O(1)$.

## Notes
- The implementation uses `int` arithmetic, so the sum and product can overflow individually. Java's modular overflow cancels in the final subtraction; the guaranteed 32-bit answer makes the final result valid. This relies on the stated answer bound.
