# Sum of Two Integers

## Idea

- Repeatedly compute carry = a AND b, replace a by a XOR b, and replace b by carry shifted left one bit. Return a when no carry remains.

## Why It Works

- XOR adds bits without carry. AND identifies positions producing a carry, and shifting places those carries in the next higher positions. Each iteration preserves the 32-bit sum while propagating pending carries until none remain.

## Edge Cases

- Zero operands finish immediately. Two’s-complement negative inputs use the same operations; discarded carries beyond bit 31 match Java integer arithmetic.

## Complexity

- O(1) time and space for fixed 32-bit integers; at most 32 carry-propagation iterations.

## Notes

- No addition or subtraction operator is used. The allowed input bounds also keep the mathematical final sum within int range.
