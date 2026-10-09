## Idea
- Find part's leftmost occurrence using indexOf.
- Rebuild the string from the prefix and suffix around that occurrence, then search again from the beginning until no occurrence remains.

## Why It Works
- indexOf selects the exact occurrence required by each operation.
- Searching the rebuilt string also detects new matches across a deletion boundary. Each deletion shortens the string, ensuring termination.

## Edge Cases
- If part never occurs or is longer than s, return s unchanged.
- Overlapping occurrences and newly formed matches are resolved through repeated leftmost searches.

## Complexity
- O(n²) conservative time bound for standard substring search and copying across at most n / p deletions, where p is part's length.
- O(n) peak auxiliary space for rebuilt strings; total temporary allocation can be O(n²).
