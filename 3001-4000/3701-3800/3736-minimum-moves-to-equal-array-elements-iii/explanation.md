# 3736. Minimum Moves to Equal Array Elements III

## Idea

- Elements can only increase, so the final common value cannot be smaller than the current maximum.
- Choosing a value greater than the maximum only adds unnecessary moves.
- Therefore every value should be raised exactly to the current maximum.

## Why It Works

- An element `num` needs `max - num` moves to reach `max`.
- Summing this over the whole array gives `n * max - sum(nums)`.
- This target is feasible for every element and is the smallest feasible target, so it uses the fewest moves.

## Edge Cases

- If all values already equal the maximum, the formula returns zero.
- Negative values work too: only the gap from each value to the maximum matters.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Tags

- Array
- Math
- Greedy
