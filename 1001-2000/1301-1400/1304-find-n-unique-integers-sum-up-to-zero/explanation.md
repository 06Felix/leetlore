## Idea

- Emit positive/negative pairs 1,−1 through floor(n/2), adding zero when n is odd.

## Why It Works

- Each pair sums to zero and uses distinct nonzero values. The optional zero is unique and preserves the total.

## Edge Cases

- n=1 returns [0]; even n needs no zero.

## Complexity

- O(n) time and O(1) auxiliary space beyond the output.
