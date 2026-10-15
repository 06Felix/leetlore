# The Two Sneaky Numbers of Digitville

## Idea

- Allocate a frequency array and scan nums. Whenever a value has been seen before, append it to the two-element answer.

## Why It Works

- Every ordinary value appears once, while exactly two distinct values appear twice. Their second occurrences are therefore precisely the two entries appended.

## Edge Cases

- Zero is a valid value; duplicate discovery order is allowed in the output.

## Complexity

- O(n) time and O(n) space, where nums contains n + 2 elements.

## Notes

- The fixed answer size relies on the guarantee of exactly two repeated elements, each with one extra occurrence.
