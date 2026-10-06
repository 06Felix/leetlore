# Explanation

## Idea
- Compare the disjoint pairs at indices `(0,1)`, `(2,3)`, and so on.
- Count one required change for every pair whose two characters differ.

## Why It Works
- Every even-length partition boundary is at an even offset, so a disjoint pair cannot cross a boundary. Its characters must agree in any beautiful result.
- A mismatched pair requires at least one change; a matching pair requires none.
- Fixing every mismatched pair with one change yields a valid partition into constant two-character substrings, attaining the lower bound.

## Edge Cases
- An already beautiful string needs zero changes, including neighboring pairs of different bits.
- The guaranteed even length makes `i + 1` valid for every loop iteration.

## Complexity
- Time: $O(n)$.
- Working space: $O(1)$ after receiving the string; this C++ method takes it by value, so an ordinary lvalue call also makes an $O(n)$ parameter copy.
