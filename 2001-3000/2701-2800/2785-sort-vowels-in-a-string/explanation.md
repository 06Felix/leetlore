## Idea

- Count each of the ten uppercase/lowercase vowels. Refill vowel positions using a pointer through the explicitly ordered keys AEIOUaeiou, leaving consonants in place.

## Why It Works

- The count map preserves the vowel multiset. Each vowel slot receives the smallest remaining vowel, so the vowel subsequence is sorted by ASCII while every consonant remains fixed.

## Edge Cases

- No vowels returns the original contents. Uppercase vowels precede lowercase vowels; duplicate counts are consumed individually.

## Complexity

- O(length) time and O(length) space for the character arrays and result.
