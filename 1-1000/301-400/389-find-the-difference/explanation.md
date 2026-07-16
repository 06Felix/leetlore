# Find the Difference

## Idea

- The implementation counts letters from both `s` and `t` in one frequency array.
- Characters from `s` and `t` are both added to the same count.
- Every original character appears an even number of total times across the two strings.
- The added character has odd count and is returned.

## Why It Works

- `t` contains all characters from `s` plus one extra character.
- Adding counts from both strings makes matching characters contribute twice.
- The only count with odd parity belongs to the extra character.
- Scanning the 26 lowercase letters finds that character.

## Edge Cases

- If `s` is empty, the only character in `t` has odd count.
- Duplicate letters still cancel by parity except for the extra occurrence.
- The constraints limit input to lowercase English letters.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
