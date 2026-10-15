# Find Minimum Operations to Make All Elements Divisible by Three

## Idea

- Count elements whose remainder modulo three is nonzero.

## Why It Works

- Multiples of three require no change. A remainder-one value reaches a multiple by subtracting one; a remainder-two value does so by adding one. Every nonmultiple needs at least one operation, and these independent one-step changes attain that lower bound.

## Edge Cases

- An array of multiples returns zero. Values can be changed to zero because the operation does not require them to remain positive.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The implementation counts operations without modifying nums.
