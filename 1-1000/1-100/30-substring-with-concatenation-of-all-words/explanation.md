## Idea

- Scan word-sized chunks separately for every alignment modulo the common word length. Track target and window word counts, reset on unknown chunks, and shrink excess occurrences before recording full-size matches.

## Why It Works

- Each alignment covers all candidate starts in its residue class. After adjustment, every chunk belongs to the target multiset and no count exceeds its quota. A window containing exactly the required number of words must therefore have precisely the target multiset. Shrinking only excessive counts preserves overlapping matches.

## Edge Cases

- Repeated words require their full multiplicity. If the full concatenation is longer than s, return empty immediately.

## Complexity

- Expected O((s length+word count)·word length) time, including substring copying and hashing; O(word count·word length+s length) space including map keys and output.

## Notes

- Results are grouped by alignment and need not be sorted; the problem allows any order.
