## Idea

- Return true as soon as any vowel is found.

## Why It Works

- Without a vowel, Alice has no legal opening move. With an odd positive vowel count, she removes the whole string immediately. With an even positive count, she removes one vowel; Bob’s even-vowel removal leaves an odd positive count, after which Alice can remove the entire remainder.

## Edge Cases

- All consonants loses; a single vowel is sufficient regardless of surrounding consonants.

## Complexity

- O(length) time and O(length) auxiliary space for toCharArray, even when the scan returns early.
