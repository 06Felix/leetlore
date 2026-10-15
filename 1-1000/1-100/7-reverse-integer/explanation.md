# Reverse Integer

## Idea

- Remember the sign, negate negative inputs, and reverse the resulting positive digits into a long accumulator. Return zero if the accumulator exceeds int bounds; otherwise restore the sign.

## Why It Works

- Repeated extraction and multiplication reconstruct the digit reversal. A wider accumulator preserves the full reversed magnitude for the range check before casting back to int.

## Edge Cases

- Zero returns zero. Trailing zeroes disappear naturally. Negating Integer.MIN_VALUE wraps and leaves it negative, so the digit loop is skipped and returns zero, which is the required result because its reversal is out of range.

## Complexity

- O(d) time and O(1) auxiliary space for d decimal digits.

## Notes

- The use of long rev violates the explicit restriction against storing 64-bit integers. The explanation describes the submitted implementation; it does not replace it with an int-only overflow-checking algorithm.
