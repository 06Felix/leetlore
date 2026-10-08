# Explanation

## Idea
- XOR all values of `nums1` only when `nums2` has odd length.
- XOR all values of `nums2` only when `nums1` has odd length, then return the accumulated result.

## Why It Works
- Across all pairings, each value appears as an XOR contribution once for every element of the opposite array.
- An even number of identical contributions cancels; an odd number leaves the value once. The two parity checks retain precisely those surviving contributions.

## Edge Cases
- If both lengths are even, the answer is zero.
- Singleton arrays and zero values follow the same cancellation rule.

## Complexity
- Time: $O(n + m)$ as an upper bound; arrays whose contributions cancel are not scanned.
- Auxiliary space: $O(1)$.
