# Number of Digit One

## Idea

- For each decimal place pow10, split the range into full cycles of length 10 * pow10 and a remainder. Add pow10 ones per full cycle, plus the remainder contribution clamped between zero and pow10.

## Why It Works

- At a fixed place, digits repeat in equal-size blocks. The digit one occupies exactly the block from pow10 through 2 * pow10 - 1 in each cycle, so the full-cycle count and clamped partial block count all appearances at that place. Summing places counts every digit occurrence once.

## Edge Cases

- n = 0 performs no iterations. Partial cycles contribute nothing before the one block and at most a complete pow10 block afterward.

## Complexity

- O(log(n + 1)) time and O(1) auxiliary space.

## Notes

- Place values and cycle arithmetic use long. Under n <= 10^9, the final count is at most 900000001 and fits the int return value.
