# Explanation

## Idea

- While the current number has more than one digit, repeatedly sum its digits.
- Replace the number with that digit sum and continue until one digit remains.

## Why It Works

- Each pass performs exactly the operation required by the problem for the current number.
- A digit sum is strictly smaller than the original multi-digit non-negative number, so the process reaches a single digit.
- The remaining digit is the digital root returned by the method.

## Edge Cases

- A single-digit input is returned immediately.
- `0` stays `0` because the inner loop contributes no digits.

## Complexity

- Time: `O(log10(num)^2)` for the repeated simulation.
- Space: `O(1)`.
