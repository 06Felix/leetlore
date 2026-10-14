# Maximum Frequency of an Element After Performing Operations II

## Idea

- Sort the array. For each index except the last, test its value and the two endpoints value - k and value + k. Binary searches count target duplicates and other values within distance k; cap conversions by the operation budget.

## Why It Works

- For a fixed target, its frequency is existing duplicates plus the affordable reachable unequal values. Coverage changes at interval endpoints, while existing values supply free matches, so these candidates suffice. A unique final value is unnecessary: if it can absorb any earlier value, the preceding value offers at least as good a target; duplicated final values are tested at an earlier index.

## Edge Cases

- One element returns 1. Zero operations use existing duplicates; unused operations may add zero.

## Complexity

- O(n log n) time and O(log n) sorting stack space; each candidate uses four binary searches.

## Notes

- Sorting mutates nums. Search bounds use long arithmetic, and tested int endpoints remain within the stated constraints.
