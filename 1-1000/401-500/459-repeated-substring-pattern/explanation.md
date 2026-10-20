# Repeated Substring Pattern

## Idea

- Try candidate repeated-block lengths from half the string length down to one. Only consider divisors of the total length whose final character matches the whole string’s final character; repeat the prefix and compare it with s.

## Why It Works

- A valid repeated block must divide the full length and have length at most half because at least two copies are required. The boundary-character check is necessary but only a filter; full repeated-string equality verifies every position.

## Edge Cases

- A one-character string has no candidate and returns false. Repeated single characters are found with block length one.

## Complexity

- O(n^2) conservative worst-case time and O(n) temporary space; only divisor candidates allocate repeated strings.

## Notes

- The implementation constructs candidate repeated strings rather than using a prefix-function algorithm. The input is unchanged.
