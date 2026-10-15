# Greatest Sum Divisible by Three

## Idea

- Maintain three best-sum slots. For each number, iterate a clone of the previous slots and update the slot for (sum + num) % 3 with the larger candidate. Return slot zero.

## Why It Works

- Every stored nonzero sum is reachable. Cloning prevents reusing the current number within its own iteration. For a given remainder, a larger reachable sum dominates smaller ones for all future additions, so retaining only maxima preserves an optimal divisible sum.

## Edge Cases

- The empty subset provides sum zero. Although all three slots initially contain zero, these placeholders only generate valid singleton sums: the loop uses the stored values and recomputes each new remainder, rather than trusting the source slot index.

## Complexity

- O(n) time and O(1) auxiliary space; each clone contains exactly three integers.

## Notes

- Inputs are positive and their total is at most 400,000,000, so int arithmetic is safe. The input remains unchanged.
