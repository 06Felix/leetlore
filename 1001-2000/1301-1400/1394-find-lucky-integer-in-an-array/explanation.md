## Idea

- Count values at most the array length, then scan those frequencies downward and return the first value whose frequency equals itself.

## Why It Works

- A value greater than n cannot occur that many times in an array of length n. All possible lucky values are therefore counted, and descending order finds the largest.

## Edge Cases

- No matching frequency returns −1. Values larger than n are safely ignored.

## Complexity

- O(n) time and O(n) auxiliary space.
