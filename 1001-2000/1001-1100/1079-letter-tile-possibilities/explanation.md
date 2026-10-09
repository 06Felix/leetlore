## Idea
- Generate permutations of every nonempty length from one through the tile count.
- Insert each resulting letter tuple into a set and return the set's size.

## Why It Works
- Every usable sequence corresponds to a permutation of some subset of tile positions.
- Repeated letters can make several position permutations identical; set deduplication ensures each letter sequence is counted once.

## Edge Cases
- A single tile produces one sequence.
- All equal tiles produce one distinct sequence per length; all different tiles retain every generated permutation.

## Complexity
- O(sum over r of r × n! / (n - r)!) time for tuple construction and hashing, bounded by O(n × n!).
- O(n × n!) worst-case tuple storage; n is at most seven.

## Notes
- The file assumes permutations is available in the judge environment; it contains no explicit itertools import.
