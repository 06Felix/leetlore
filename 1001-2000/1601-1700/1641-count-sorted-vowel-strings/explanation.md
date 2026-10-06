# Explanation

## Idea
- Evaluate the closed form $\binom{n+4}{4}$ as `(n + 4) * (n + 3) * (n + 2) * (n + 1) / 24`.
- Count vowel multiplicities instead of explicitly building strings.

## Why It Works
- A sorted vowel string is uniquely determined by its five nonnegative vowel counts summing to `n`.
- Stars and bars places four separators among `n + 4` positions, giving $\binom{n+4}{4}$ possibilities.
- Expanding the binomial coefficient yields the exact expression used by the implementation.

## Edge Cases
- `n = 1` yields five strings, and `n = 2` yields fifteen.
- At `n = 50`, the numerator is 7590024, so every integer multiplication remains within `int` under the stated bounds.

## Complexity
- Time: $O(1)$.
- Auxiliary space: $O(1)$.
