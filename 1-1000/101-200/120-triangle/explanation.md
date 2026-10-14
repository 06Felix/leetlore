## Idea

- Copy the last triangle row into a one-dimensional DP array, then process rows upward using currentValue+min(two child costs).

## Why It Works

- Every path from a position chooses one of its two children. Their optimal suffix costs determine the minimum from that position. Updating columns left to right keeps mem[j] and mem[j+1] from the previous lower row until both are read.

## Edge Cases

- A one-row triangle returns its sole value. Negative entries require no special cases.

## Complexity

- O(rows²) time and O(rows) space.
