## Idea

- Split words, require their count to equal the pattern length, and compare previous occurrence indices stored in separate character and word maps.

## Why It Works

- Matching previous occurrence positions enforce identical repetition patterns and therefore a bijection. At each position, both maps store the very same Integer object, so corresponding previous positions also have identical references. This makes the stored reference comparison work even for indices outside Java’s small-integer cache.

## Edge Cases

- Different word counts fail immediately. Repeated words and letters must repeat at exactly the same positions.

## Complexity

- Expected O(string length+pattern length) time and O(string length+pattern length) space for tokens and maps.

## Notes

- The comparison uses Integer reference inequality. It is correct here because each matching pair receives the same loop-index object; changing the insertion code to box indices independently could break that assumption.
