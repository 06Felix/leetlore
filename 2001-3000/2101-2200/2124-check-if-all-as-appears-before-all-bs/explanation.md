## Idea

- Find the first b in the original string and the first a in the reversed string. Convert the latter to the last-a position and require it to be before the first b.

## Why It Works

- All a characters precede all b characters exactly when the last a lies before the first b. If aInd is the reversed index, that last position is n−1−aInd; the code’s bInd≥n−aInd is the equivalent integer inequality.

## Edge Cases

- If either letter is absent, the condition is true. A single-character string therefore returns true.

## Complexity

- O(length) time and O(length) space for the reversed string.
