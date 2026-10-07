# Explanation

## Idea
- Keep a set of previously encountered values.
- Before inserting a value, check for its double or, when even, its half.

## Why It Works
- The two checks cover either arrival order of a value and its double.
- Checking before insertion guarantees distinct indices, including the zero case.

## Edge Cases
- Two zeros qualify, but a lone zero does not pair with itself.
- Negative values work normally; the evenness guard excludes fractional halves.

## Complexity
- Expected time: $O(n)$.
- Auxiliary space: $O(n)$ for the set.
