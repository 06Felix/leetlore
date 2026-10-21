# Shortest Palindrome

## Idea
- Scan backward while advancing `left` whenever the scanned character matches the next prefix character.
- If the whole string matches, return it. Otherwise split at `left`, recursively complete the prefix, and surround it with the reversed suffix and the original suffix.

## Why It Works
- Any palindromic prefix of length $p$ guarantees at least $p$ matching advances during the backward scan. Thus the longest palindromic prefix lies entirely within the recursive prefix.
- The recursive call finds the shortest completion of that prefix. Mirroring the excluded suffix around it yields a palindrome that ends in the original string.
- The longest palindromic prefix is unchanged by truncating to `left`; consequently the construction adds exactly the characters outside that longest prefix, which is minimal.

## Edge Cases
- Empty strings and complete palindromes return immediately.
- Repeated characters and one-character prefixes use the same recursion; each nonterminal call strictly shortens the string.

## Complexity
- Let $L$ be the sum of string lengths across recursive calls. Scanning and string construction cost $O(L)$ time.
- Conservatively, $L=O(n^2)$; copied prefix substrings retained by recursive calls can also use $O(n^2)$ space in modern Java, with $O(n)$ stack depth as an upper bound.

## Notes
- This is a recursive matching approach, not linear-time KMP. Recursion depth and repeated string copying are practical limits for large inputs.
