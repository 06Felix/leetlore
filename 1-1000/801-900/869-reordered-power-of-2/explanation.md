## Idea

- Compare n’s digit-frequency map against every power of two that fits in an int.

## Why It Works

- A decimal reordering exists exactly when digit multiplicities match one candidate power.

## Edge Cases

- Leading zeros cannot arise because powers of two have no leading zero and frequency maps must be equal.

## Complexity

- O(30·digits) time and O(digits) space.
