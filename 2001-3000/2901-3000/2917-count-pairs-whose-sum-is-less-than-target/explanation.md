# Count Pairs Whose Sum is Less than Target

## Idea

- Check every pair of indices `(i, j)` with `i < j`.
- For each pair, add one to the answer if `nums[i] + nums[j] < target`.
- The constraints are small enough that direct enumeration is sufficient.

## Why It Works

- The nested loops generate each valid index pair exactly once because `j` starts at `i + 1`.
- The condition inside the loop is the same strict inequality required by the problem.
- Counting only when the condition holds gives the exact number of qualifying pairs.

## Edge Cases

- Negative numbers work because the implementation compares the actual integer sum.
- Duplicate values are counted by index pairs, as required.
- An input with fewer than two useful matching elements naturally returns `0`.

## Complexity

- Time: `O(n^2)`, where `n` is `nums.size()`.
- Space: `O(1)`.
