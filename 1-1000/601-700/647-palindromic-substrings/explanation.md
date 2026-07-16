# Explanation

## Idea

- Treat every index as the center of an odd-length palindrome.
- Treat every gap between adjacent indices as the center of an even-length palindrome.
- Expand outward while both ends match and count each valid expansion.

## Why It Works

- Every palindrome has exactly one center: either a character or a gap.
- Expanding from a center visits all palindromes with that center from shortest to longest.
- Summing the counts from all centers counts each palindromic substring once.

## Edge Cases

- Single-character strings count as one odd-centered palindrome.
- Even palindromes like `"aa"` are found by the `(i, i + 1)` center.
- Expansion stops cleanly at string boundaries or the first mismatched pair.

## Complexity

- Time: $O(n^2)$ in the worst case.
- Space: $O(1)$ extra space.
