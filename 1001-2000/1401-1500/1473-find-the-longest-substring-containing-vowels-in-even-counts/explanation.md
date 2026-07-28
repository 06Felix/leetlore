# Find the Longest Substring Containing Vowels in Even Counts

## Idea

- Track vowel parity with a 5-bit mask, one bit for each vowel.
- Flip the corresponding bit whenever a vowel appears.
- Store the first index where each mask was seen, then use repeated masks to measure valid substrings.

## Why It Works

- A substring has all vowels in even counts exactly when the parity mask at its end equals the mask before its start.
- Keeping the earliest index for each mask maximizes the length when that mask appears again.
- Consonants do not change the mask, so they naturally extend current candidates.

## Edge Cases

- A substring starting at index `0` works because mask `0` is seeded at index `-1`.
- Strings with no vowels keep mask `0`, so the whole string is counted.
- Large inputs are handled in one pass.

## Complexity

- Time: `O(n)`, with a constant-size vowel lookup per character.
- Space: `O(1)`, since there are only `32` possible parity masks.
