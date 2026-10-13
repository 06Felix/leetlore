## Idea

- Split both version strings on dots. Compare numeric revisions from left to right, treating absent revisions as zero, and return on the first difference.

## Why It Works

- Integer parsing removes the significance of leading zeros. The first unequal revision determines the prescribed order; missing zero revisions cannot change equality.

## Edge Cases

- Trailing zero revisions are ignored through zero padding. Each revision is guaranteed to fit a signed 32-bit integer.

## Complexity

- O(total version-string length) time and space for split strings.
