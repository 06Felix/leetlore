# Explanation

## Idea
- Test the whole input against a pattern for eight IPv6 hexadecimal groups.
- If that fails, test a pattern for four IPv4 decimal octets; return `Neither` if neither matches.

## Why It Works
- The IPv6 pattern requires exactly eight groups of one to four hexadecimal characters separated by colons.
- The IPv4 alternatives encode 0 through 255 and allow a leading zero only for the single digit zero.
- Whole-string matching rejects extra characters, missing groups, and mixed separators.

## Edge Cases
- IPv6 accepts upper- and lowercase hexadecimal letters and leading zeros within a group.
- IPv4 rejects leading-zero octets and values above 255. Compressed IPv6 such as `::` is invalid under this problem's rules.

## Complexity
- Time: $O(L)$ as an upper bound for the fixed, bounded-repetition patterns on input length $L$.
- Auxiliary space: $O(1)$ for these fixed-size patterns and their bounded matching state.
