# Explanation

## Idea

- Convert the number to a 26-based representation, but treat `A` as `1` rather than `0`.
- Decrement before taking the remainder so `1..26` map to `A..Z`.
- Append letters from right to left and reverse the builder at the end.

## Why It Works

- After decrementing, `columnNumber % 26` selects the current letter's zero-based offset.
- Dividing by `26` advances to the remaining higher-order digits.
- Repeating this extracts the same digits as Excel's one-based base-26 notation.

## Edge Cases

- `1` maps to `A` and `26` maps to `Z` because of the pre-decrement.
- Values producing multiple letters are reversed after extraction.

## Complexity

- Time: `O(log26(columnNumber))`.
- Space: `O(log26(columnNumber))`.
