# Palindromic Substrings

## Idea

- The solution treats every index as the center of odd-length palindromes.
- It also treats every gap between indices as the center of even-length palindromes.
- `extendPalindromes` expands outward while both sides are in range and equal.
- Each successful expansion counts one palindrome.

## Why It Works

- Every palindrome has exactly one center, either a character or a gap.
- Expanding from that center enumerates palindromes in increasing radius.
- The first mismatch or boundary ends all larger palindromes for that center.
- Summing over all centers counts every palindromic substring once.

## Edge Cases

- Single characters are counted by odd centers.
- Repeated characters like `"aaa"` produce multiple expansions from nearby centers.
- Even-length palindromes are covered by starting at `(i, i + 1)`.

## Complexity

- Time: $O(n^2)$.
- Space: $O(1)$.
