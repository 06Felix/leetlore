# Max Consecutive Ones

## Idea

- Use ans as the current run length and count as the best completed run. Extend ans at one; at zero, update count and reset ans. Compare once more after the scan.

## Why It Works

- A zero ends every all-one run passing through it, so the accumulated run is complete at that point. The final comparison includes a run ending at the last array entry, ensuring every candidate run is considered.

## Edge Cases

- All zeroes return zero. All ones are handled by the final comparison.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- Despite their names, ans is the current run and count is the returned maximum. The input is unchanged.
