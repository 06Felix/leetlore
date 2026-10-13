## Idea

- Sort and group equal spell powers into one earned sum. Use suffix DP that skips a group or takes it plus the first group with power at least current+3, found by binary search.

## Why It Works

- All spells with the same positive power can be taken together without introducing additional conflicts. Taking that group forbids only powers one or two away; the next compatible group begins an independent suffix. The skip/take recurrence covers every valid selection.

## Edge Cases

- Equal powers contribute their full multiplicity. Long sums hold damage up to 10¹⁴; current+3 fits int under the 10⁹ bound.

## Complexity

- O(n log n) time and O(n) auxiliary space.

## Notes

- Sorting modifies power.
