# Least Number of Unique Integers after K Removals

## Idea

- The implementation counts the frequency of each integer.
- It sorts the frequencies in increasing order.
- It removes whole values starting from the smallest frequency because they cost the fewest deletions.
- When the next frequency is larger than the remaining `k`, it returns the current number of unique values.

## Why It Works

- Reducing the unique count requires removing every occurrence of some value.
- Removing a value with smaller frequency is never worse than removing a value with larger frequency.
- Sorting frequencies and greedily spending `k` on the smallest counts therefore removes the maximum number of distinct values.
- The remaining `si` tracks how many unique integers are still present.

## Edge Cases

- `k = 0` returns the original number of unique values.
- If `k` removes all values, the loop finishes and returns `0`.
- Duplicate-heavy arrays work because only frequency counts matter.

## Complexity

- Time: $O(n + u \log u)$, where `u` is the number of unique integers.
- Space: $O(u)$.
