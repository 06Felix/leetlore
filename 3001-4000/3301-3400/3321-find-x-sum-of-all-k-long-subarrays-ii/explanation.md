# Find X-Sum of All K-Long Subarrays II

## Idea

- Keep (frequency, value) pairs in two TreeSets. main holds the best x pairs and their weighted sum; sec holds the rest. Remove a value’s old pair before inserting its updated frequency as the window grows or shrinks.

## Why It Works

- Ordering by frequency then value implements both ranking rules. Insertions demote the smallest selected pair when necessary; removals promote the largest excluded pair. These operations preserve the top-x partition, so the maintained sum is the current window’s x-sum.

## Edge Cases

- With fewer than x distinct values, all pairs belong to main. Frequencies reaching zero disappear entirely. A long sum handles large frequency-value products.

## Complexity

- O(n log(k + 1)) time and O(k) working space, plus O(n - k + 1) output.

## Notes

- TreeSet removal uses the comparator, so newly allocated arrays with matching pair contents correctly remove existing entries. The input is unchanged.
