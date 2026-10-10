## Idea
- Enumerate every starting position and extend the substring to every possible ending position.
- Track distinct vowels in a set and count consonants, incrementing the answer exactly when all five vowels are present and the consonant count equals k.

## Why It Works
- Each substring has one unique start/end pair, so enumeration visits it exactly once.
- The two maintained statistics test precisely the required conditions.

## Edge Cases
- Repeated vowels do not increase the distinct-vowel count.
- k = 0 requires no consonants; a missing vowel prevents a match regardless of consonant count.

## Complexity
- O(n²) expected time for bounded-size set operations.
- O(1) auxiliary space because both sets contain at most five vowels.
