## Idea

- Keep the largest positive value from each distinct value; return zero if none are positive.

## Why It Works

- Deleting arbitrary elements leaves a subsequence, so every retained distinct positive contributes independently and negative values are never useful.

## Edge Cases

- Duplicates and all-nonpositive input return the correct maximum.

## Complexity

- O(n) expected time and O(n) set space.
