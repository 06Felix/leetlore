# Maximize Happiness of Selected Children

## Idea

- Sort happiness ascending, then traverse from largest to smallest and subtract the selection rank from every entry. Sum positive adjusted values among the first k largest original entries.

## Why It Works

- A child selected after t turns contributes max(original - t, 0). Choosing larger values earlier is optimal: swapping a larger value ahead of a smaller one cannot reduce the two contributions, and replacing any selected value with a larger unselected value cannot hurt. Thus the descending order and rank penalties attain the maximum.

## Edge Cases

- Exactly k children are selected conceptually even when later contributions are zero. The code omits nonpositive contributions rather than adding negative values.

## Complexity

- O(n log n) time and O(log n) sorting stack space. Both later scans are linear.

## Notes

- The implementation sorts and overwrites the whole happiness array, including entries beyond the selected k. Adjusted entries may become negative internally, but only positive values are added to the long result.
