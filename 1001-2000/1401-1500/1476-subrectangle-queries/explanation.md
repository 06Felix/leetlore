# Subrectangle Queries

## Idea

- Keep the initial rectangle reference and append each update’s bounds and value to a history list. For getValue, scan updates backward and return the first covering value, falling back to the original cell.

## Why It Works

- Assignments overwrite earlier values, so the most recent update covering a coordinate uniquely determines its current value. Reverse scanning finds exactly that update without materializing any changed cells.

## Edge Cases

- Overlapping updates use the latest matching one. A coordinate never covered returns its initial value. Boundaries are inclusive.

## Complexity

- O(1) constructor, amortized O(1) per update, O(U) worst-case per read, and O(U) additional storage for U updates.

## Notes

- The constructor retains the original rectangle by reference. The class does not modify its cells, but external changes to that array affect fallback reads.
