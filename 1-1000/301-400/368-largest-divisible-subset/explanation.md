# Largest Divisible Subset

## Idea
- Sort the values and compute the longest divisible chain ending at each index.
- For every smaller divisor, extend its best chain and store a predecessor index; reconstruct from the longest chain's endpoint.

## Why It Works
- A sorted valid subset forms a divisibility chain: each consecutive larger value is divisible by its predecessor.
- Divisibility is transitive, so adding a multiple of the chain's last value preserves the requirement for every pair.
- The DP considers every possible predecessor; following its stored links recovers a maximum-size valid subset.

## Edge Cases
- A single element or a set with no divisible pairs returns a singleton; multiple optimal subsets are allowed.
- Reconstruction returns values in descending order, which is acceptable because answer order is unrestricted.

## Complexity
- Time: $O(n^2)$ for all predecessor checks, dominating sorting and reconstruction.
- Space: $O(n)$ for DP lengths, predecessor indices, and the answer.

## Notes
- Sorting changes the input array's order in place.
- Positivity guarantees all modulus divisors are nonzero.
