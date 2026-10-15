# Unique Length-3 Palindromic Subsequences

## Idea

- Record the first and last occurrence of each letter. For each letter appearing at least twice, count distinct characters strictly between those endpoints and add that count.

## Why It Works

- A length-three palindrome has form aba. Such a subsequence exists exactly when b occurs between some two copies of a; the widest span from the first a to the last a contains every possible middle character. Distinct counting avoids duplicate palindromes.

## Edge Cases

- Adjacent endpoint copies have an empty middle range. A repeated outer letter may also be the middle character, producing aaa.

## Complexity

- O(26n) time and O(n) temporary space for copied substrings; the fixed alphabet metadata and distinct-character set use constant space.

## Notes

- The lowercase-English constraint limits the answer to 26 * 26 = 676. The original string remains unchanged.
