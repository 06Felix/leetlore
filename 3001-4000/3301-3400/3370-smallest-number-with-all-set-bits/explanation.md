# Smallest Number With All Set Bits

## Idea

- Starting at n, increment x until (x & (x + 1)) equals zero. Return the first passing value.

## Why It Works

- For a positive integer, this bit test succeeds exactly when all bits through the highest set bit are ones. Checking candidates in increasing order makes the first success the smallest valid result.

## Edge Cases

- An already valid n returns immediately; n = 1 returns 1.

## Complexity

- O(n) worst-case time and O(1) space. More precisely, the loop takes (2^b - 1) - n increments for a b-bit input.

## Notes

- This implementation scans candidates rather than directly constructing a mask. n <= 1000 keeps arithmetic safe.
