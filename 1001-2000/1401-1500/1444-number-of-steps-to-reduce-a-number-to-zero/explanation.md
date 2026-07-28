# Number of Steps to Reduce a Number to Zero

## Idea

- Handle `0` directly.
- For positive numbers, use bit properties instead of simulating every operation.
- Each `1` bit requires one subtract operation, and each bit position after the highest bit contributes one divide-by-two operation.

## Why It Works

- Subtracting one from an odd number clears its lowest set bit before divisions continue.
- Dividing by two shifts the binary representation right by one bit.
- A positive number with bit length `L` needs `L - 1` divisions and `bitCount(num)` subtractions.
- The expression `31 - Integer.numberOfLeadingZeros(num) + Integer.bitCount(num)` equals `(L - 1) + bitCount(num)`.

## Edge Cases

- `num = 0` returns `0` before calling the bit-length formula.
- Powers of two need one subtraction and one division per lower bit.
- Odd numbers naturally include the extra subtraction for each set bit.

## Complexity

- Time: `O(1)`.
- Space: `O(1)`.
