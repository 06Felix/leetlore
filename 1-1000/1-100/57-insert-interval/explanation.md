## Idea

- Copy intervals ending before the new interval, merge every interval starting before its growing end, append the merged interval, then copy the remaining suffix.

## Why It Works

- Sorted disjoint input separates into intervals strictly before, overlapping, and strictly after the insertion. Updating the new boundaries absorbs all overlaps, including ones reached by a growing end. The untouched prefix and suffix remain ordered and disjoint from the merged interval.

## Edge Cases

- Touching endpoints merge because the intervals are closed. Empty input returns the new interval.

## Complexity

- O(n) time and O(n) result space.

## Notes

- The supplied newInterval array is modified; returned rows reuse that array and existing interval arrays.
