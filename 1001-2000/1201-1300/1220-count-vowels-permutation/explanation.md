# Explanation

## Idea
- Store the number of current strings ending in each of `a`, `e`, `i`, `o`, and `u`, initially one each.
- Build a fresh five-entry array for each additional character by summing allowed predecessor endings, modulo $10^9 + 7$.

## Why It Works
- For example, `a` can follow `e`, `i`, or `u`, so its next count is the sum of those three previous counts.
- Every valid string has one uniquely determined previous ending. These predecessor sums count all allowed extensions once, and a fresh array prevents mixing lengths.

## Edge Cases
- Length one returns five without any transition step.
- The transition for ending `o` has only predecessor `i`; repeated `i` is excluded by its predecessor list.

## Complexity
- Time: $O(n)$ with five constant-sized transitions per length.
- Auxiliary space: $O(1)$ for current and next counts.
