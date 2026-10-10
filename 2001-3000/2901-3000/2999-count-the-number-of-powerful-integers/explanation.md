# Count the Number of Powerful Integers

## Idea
- Count valid integers at most each bound using digit DP, then subtract `count(start - 1)` from `count(finish)`.
- Allow prefix digits from zero through `limit`, force the final positions to equal the suffix, and memoize by position and whether the prefix still matches the bound.

## Why It Works
- Tight states restrict the next digit to the bound; choosing a smaller digit allows all later permitted digits. Forced suffix transitions retain the same bound checks.
- Leading zeros in the free prefix uniquely represent shorter numbers, including the suffix itself, without adding duplicate representations.
- Because the suffix is positive and has no leading zeros, every completed representation denotes a positive integer that truly ends in that suffix.

## Edge Cases
- A bound below the suffix's numeric value returns zero; suffix-only numbers are counted when within range.
- Each bound gets a fresh memo table, preventing cached tight states from one bound leaking into the other.

## Complexity
- Time: $O(D(limit+1))$ for each of the two bounds, where $D$ is its decimal digit count.
- Space: $O(D)$ for memo states, the bound string, and recursion.

## Notes
- Leading-zero padding is correct here because the statement forbids a leading zero in the suffix; a generalized suffix such as `01` would need different handling.
- The memo key omits the bound and suffix because both remain fixed during each individual `find` call.
