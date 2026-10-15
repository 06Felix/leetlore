# Count Odd Numbers in an Interval Range

## Idea

- Compute the inclusive interval length, add one if low is odd, then divide by two using integer division.

## Why It Works

- Consecutive integers alternate parity. Each full pair contributes one odd number; an unpaired endpoint contributes another exactly when the interval starts odd. The formula handles both parities of the interval length.

## Edge Cases

- A single odd endpoint contributes one and a single even endpoint contributes zero. low may be zero.

## Complexity

- O(1) time and space.

## Notes

- The bounds keep high - low + 2 within int range.
