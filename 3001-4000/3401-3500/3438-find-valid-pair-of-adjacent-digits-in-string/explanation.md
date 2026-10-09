## Idea
- Count each digit's occurrences, then scan adjacent pairs from left to right.
- Return the first pair whose digits differ and whose frequencies equal their numeric values; return an empty string otherwise.

## Why It Works
- The frequency array tests both required occurrence conditions exactly.
- Scanning pairs in order makes the first qualifying pair the required leftmost answer.

## Edge Cases
- Equal adjacent digits never qualify, even if their counts match.
- If either frequency is wrong, continue scanning; no valid pair produces an empty result.

## Complexity
- O(n) time and O(n) auxiliary space: the implementation copies the string to a character array, alongside ten counters.
