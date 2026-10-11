# Find the Count of Good Integers

## Idea
- Enumerate nonzero-leading halves and mirror them to construct every n-digit palindrome, omitting the duplicated center for odd lengths.
- Keep palindromes divisible by `k`, deduplicate their sorted digit strings, then count each digit multiset's permutations without leading zeros.

## Why It Works
- Every n-digit palindrome has exactly one enumerated half. A divisible palindrome witnesses that its digit multiset is good.
- All numbers with the same multiset can rearrange to that witness; deduplication prevents multiple witnesses from counting them again.
- For digit counts $c_d$, the number of nonzero-leading arrangements is $(n-c_0)(n-1)!/\prod_d c_d!$, the multinomial count minus zero-leading arrangements.

## Edge Cases
- Single-digit palindromes and odd-length centers are handled by the same construction.
- Internal zeros are allowed, but both palindrome generation and permutation counting exclude leading zeros. Ten-digit palindromes are parsed as `long`.

## Complexity
- Time: $O(10^{\lceil n/2\rceil}n\log n)$, including sorting digit signatures.
- Space: $O(un+n)$ for $u$ distinct qualifying signatures and temporary digit storage.

## Notes
- Factorials, intermediate permutation numerators, and the total fit `long` for $n\le10$.
- Sequential division by factorials is exact: the full denominator divides the numerator, so every partial product of denominator factors also divides it.
