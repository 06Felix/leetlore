## Idea

- Count each maximal zero run and add length·(length+1)/2 at the end of the run.

## Why It Works

- A run of length r contains r choices of length one, r−1 of length two, and so on, totaling r(r+1)/2. Nonzero values separate disjoint runs.

## Edge Cases

- Flush the final run after the loop. No zeros produces zero; an all-zero array contributes one full triangular count.

## Complexity

- O(n) time and O(1) space.

## Notes

- Both the run count and result use long to hold counts beyond int range.
