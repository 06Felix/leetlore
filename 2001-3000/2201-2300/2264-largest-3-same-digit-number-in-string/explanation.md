## Idea

- Scan each triple of adjacent characters and remember the largest repeated digit.

## Why It Works

- Every good integer has a middle position whose neighbors match it, so the scan sees all candidates.

## Edge Cases

- Leading zero triples return "000"; no triple returns an empty string.

## Complexity

- O(n) time and O(1) space.

## Notes

- The loop increments i inside a match to skip overlapping centers after a found run; this still preserves the maximum candidate.
