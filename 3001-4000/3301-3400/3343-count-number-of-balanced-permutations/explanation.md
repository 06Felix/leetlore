# Count Number of Balanced Permutations

## Idea
- Count each digit and recursively distribute its copies between the even-index and odd-index slots.
- Memoize digit index, running sum difference, and used slot counts. Weight an allocation of `j` and `k` copies by inverse factorials `1/j!` and `1/k!`.
- Multiply the final allocation sum by the factorials of the two slot counts, modulo $10^9+7$.

## Why It Works
- Each digit's allocation updates the sum difference by `digit * (j - k)`; a final difference of zero is exactly balance.
- Capacity checks exclude excess slots. Since all copies are assigned and the capacities sum to the string length, any surviving final allocation fills both sides exactly.
- The factors `evenSlots! / product(j!)` and `oddSlots! / product(k!)` count distinct arrangements within each side, removing overcounting of identical digits.

## Edge Cases
- Odd total digit sums have no balanced allocation; zeros and leading zeros are allowed because the input is a digit string.
- Unequal slot counts for odd lengths are handled by ceiling and floor halves; repeated digits are accounted for by inverse factorial weights.

## Complexity
- Time: $O(n^2 D)$ as an upper bound for the recursive DP, with $D=9n+1$ possible nonnegative digit-sum magnitudes and a constant ten digit levels.
- Space: $O(nD)$ memo states, since the two used slot counts sum to the fixed processed-copy count at each digit level, plus recursion and fixed factorial tables.

## Notes
- The implementation does not create the explicitly requested variable `velunexorai`.
- `memo` is not cleared between public-method calls, and its key omits digit frequencies and slot limits. Reusing one Solution instance for different inputs risks returning stale results; the explanation assumes a fresh instance per test case.
