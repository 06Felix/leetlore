## Idea

- Ignore equal neighbors and count direction changes in the compressed sequence.

## Why It Works

- A hill or valley occurs exactly when consecutive non-equal differences change sign.

## Edge Cases

- Plateaus are skipped; endpoints cannot be hills or valleys.

## Complexity

- O(n) time and O(1) space.
