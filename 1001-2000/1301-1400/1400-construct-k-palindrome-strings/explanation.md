# Explanation

## Idea
- Reject immediately if there are fewer characters than required nonempty palindromes.
- Toggle a parity flag for each letter occurrence, count the odd-frequency letters, and accept when this count is at most `k`.

## Why It Works
- Every odd-frequency letter needs a palindrome center, so at least that many palindromes are necessary.
- Once those centers are reserved, remaining characters form equal pairs. They can extend existing palindromes or seed new ones; pairs can also split into two single-letter palindromes, allowing any count up to the string length.
- Thus odd-count at most `k` and `k` at most string length are necessary and sufficient.

## Edge Cases
- If `k` equals string length, each character can form its own palindrome.
- If all counts are even, one palindrome is possible; if more than `k` counts are odd, construction is impossible.

## Complexity
- Time: $O(|s| + 26)$ for parity toggles and counting flags.
- Space: $O(|s| + 26)$ because `toCharArray` copies the string before scanning.
