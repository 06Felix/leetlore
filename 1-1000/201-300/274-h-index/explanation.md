## Idea

- Sort citations increasingly and return n−i at the first index whose citation count is at least n−i.

## Why It Works

- At that index all n−i remaining papers have enough citations. Scanning from the start tests candidate paper counts in decreasing order, so the first feasible count is the largest h-index.

## Edge Cases

- All-zero citations returns zero. Papers with equal citations are counted separately.

## Complexity

- O(n log n) time and O(log n) sorting stack space.

## Notes

- Sorting modifies the input citations.
