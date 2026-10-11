# Longest Palindrome by Concatenating Two Letter Words

## Idea
- Store counts of unmatched two-letter words in a 26-by-26 table.
- Match each arriving word with an earlier reverse, adding four characters, then add one remaining double-letter word as a center if available.

## Why It Works
- Reverse word pairs can occupy symmetric positions of a palindrome. Pairing whenever a reverse is available consumes the maximum possible pairs for each word type.
- Double-letter words pair with themselves, while at most one unpaired double-letter word can occupy the center.
- No other unpaired word can be used, so the matched-pair total plus the optional center is optimal.

## Edge Cases
- An odd number of one double-letter type leaves one potential center; multiple possible center types still contribute only two characters total.
- Words lacking reverses contribute nothing unless they are double-letter words.

## Complexity
- Time: $O(n+26)$ for processing words and checking center candidates.
- Space: $O(26^2)=O(1)$ for unmatched counts.
