# Longest Happy Prefix

## Idea
- Grow a base-26 hash of the prefix from left to right and a hash of the suffix from right to left, using powers to preserve character order.
- Compare hashes modulo `8_417_508_174_513` for every proper prefix length and retain the longest matching length.

## Why It Works
- Equal prefix and suffix strings necessarily have the same hash because their characters use identical polynomial positions.
- Checking lengths only through $n-1$ excludes the entire string. If hash equality implied string equality, the final recorded length would be the longest happy prefix.

## Edge Cases
- One-character strings return an empty string; overlapping prefixes and suffixes are allowed.
- Encoding `a` as zero is valid for equal-length comparisons. Intermediate products fit in `long` under the chosen modulus and base.

## Complexity
- $O(n)$ time and $O(1)$ auxiliary working space, plus the returned substring.
- The input string is unchanged.

## Notes
- Correctness risk: a single modular hash is trusted without checking characters; different strings can collide.
- Confirmed counterexample: `aaaaaaaaaazboiaokllkj` returns `aaaaaaaaaa`, which is not a suffix. The ten-character base-26 value of `boiaokllkj` equals the modulus, so it hashes to zero like ten `a`s.
