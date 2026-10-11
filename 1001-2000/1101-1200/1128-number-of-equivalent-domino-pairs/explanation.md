# Number of Equivalent Domino Pairs

## Idea
- Encode each domino as `10 * min(face1, face2) + max(face1, face2)`.
- Add the number of earlier dominoes with that key to the answer, then increment its frequency.

## Why It Works
- Sorting the two faces makes either orientation share the same key; single-digit faces make the encoding collision-free.
- Each new domino forms one equivalent pair with every prior occurrence, and each pair is counted once at its later index.

## Edge Cases
- Doubles and reversed dominoes need no special cases.
- The maximum pair count for 40,000 dominoes fits `int`.

## Complexity
- Expected time: $O(n)$ for hash-map operations.
- Space: $O(45)=O(1)$ for the possible unordered face pairs.
