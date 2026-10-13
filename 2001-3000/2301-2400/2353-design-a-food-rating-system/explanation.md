## Idea

- Map each food to its cuisine and rating. For each cuisine, use a TreeMap from ratings to lexicographically ordered TreeSets of foods. Updates remove the old entry and insert the new one; queries choose the last rating and its first food.

## Why It Works

- The rating map orders groups numerically, making the final key the maximum. The name set breaks ties lexicographically. Updating both the ordered structure and food lookup maintains this invariant after every change.

## Edge Cases

- Unchanged ratings return immediately. Empty rating groups are removed, so queries never select an empty group.

## Complexity

- O(n log(n+1)) initialization, O(log(n+1)) updates and queries, and O(n) space.

## Notes

- Food names have bounded length, so string-comparison costs are bounded under these constraints.
