# Count Special Triplets

## Idea

- Count total occurrences of every value. Scan possible middle indices while maintaining frequencies strictly to their left. For middle value j, multiply the number of earlier 2j values by the number of later 2j values.

## Why It Works

- Choosing the left and right indices independently gives their frequency product. Subtracting the left count from the total leaves the suffix, except that a zero middle also equals its doubled target and must itself be subtracted. Every triplet has one middle index and is counted once.

## Edge Cases

- When 2j exceeds 100000 there can be no matching value. Zeroes need the explicit middle-element subtraction.

## Complexity

- O(n + U) time and O(U) space for U = 100001.

## Notes

- The accumulator uses long and reduces modulo 1000000007 at the end. At most C(n, 3) triplets exist, which fits long under the constraints.
