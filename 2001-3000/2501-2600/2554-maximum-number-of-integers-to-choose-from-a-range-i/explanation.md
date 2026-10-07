# Explanation

## Idea
- Build a set of banned values and scan allowed candidates from one through `n`.
- Choose each unbanned candidate that fits the remaining sum budget.

## Why It Works
- For any fixed count, the smallest available values have the least possible sum.
- Thus selecting affordable values in ascending order maximizes the count; once one is unaffordable, larger later values cannot help.

## Edge Cases
- Duplicate banned values are collapsed by the set; banned values beyond `n` have no effect.
- If no value fits, return zero. The code continues scanning rather than stopping at the first unaffordable candidate.

## Complexity
- Expected time: $O(B + n)$ for `B` banned entries.
- Auxiliary space: $O(B)$.
