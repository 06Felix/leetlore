# Explanation

## Idea

- Sort the array.
- Pair adjacent values in sorted order.
- Add the first value of each pair, which is the pair minimum.

## Why It Works

- To maximize the sum of pair minimums, each small value should be paired with the closest available larger value.
- Sorting and pairing adjacent elements prevents a large value from being wasted as the partner of a much smaller value.
- In each sorted adjacent pair `(nums[i], nums[i + 1])`, `nums[i]` is the minimum, so summing even indices gives the objective value.

## Edge Cases

- Negative values work because sorting preserves the same greedy structure.
- Duplicate values are paired normally.
- The input length is always even by constraint.

## Complexity

- Time: $O(n \log n)$ for sorting.
- Space: $O(1)$ extra beyond the sorting implementation.
