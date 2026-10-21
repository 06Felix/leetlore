# Reformat Date

## Idea

- Detect a one-digit day from the letter at position one and prepend a zero when needed. Read the normalized day, map the three-letter month to its two-digit number, and extract the year at fixed positions.

## Why It Works

- After optional zero-padding, both day formats occupy two digits followed by a two-letter suffix and a space. The month and year then have fixed offsets, and joining year-month-day gives the required representation.

## Edge Cases

- Single-digit days receive a leading zero. Months already have zero-padded map values.

## Complexity

- O(1) time and space under the fixed date format and year bounds.

## Notes

- The statement guarantees valid dates, so the fixed-offset parsing does not validate malformed inputs.
