## Idea

- For each equal-character run of length r, add r−1; add one for the unchanged word.

## Why It Works

- At most one run can be shortened. It can retain any length from one through r−1, producing r−1 distinct alternatives. Shortening different runs changes different positions, so the alternatives do not overlap.

## Edge Cases

- A word with no adjacent repeats has one possible original; a single run of length n has n possibilities.

## Complexity

- O(n) time and O(n) space for the character array.
