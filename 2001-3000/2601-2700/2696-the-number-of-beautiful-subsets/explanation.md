# Explanation

Problem: [The Number of Beautiful Subsets](https://leetcode.com/problems/the-number-of-beautiful-subsets/)

## Idea

Count equal values, then process each chain of values that differ by `k`: `x, x + k, x + 2k, ...`. For each value with frequency `cnt`, choosing at least one copy has `(2^cnt - 1)` possibilities, but adjacent values in the chain cannot both be chosen.

## Why It Works

Values from different `k`-chains do not conflict with each other, so their choices can be combined. Inside one chain, the only conflicts are between adjacent chain values, because those pairs differ by exactly `k`. The implementation starts only at values with no `cur - k`, then walks forward by `k`. Its `prev` and `prevPrev` variables track the contribution from including the previous chain value versus skipping past it, so when the current value is included it is combined only with states that did not include the adjacent predecessor. The final `res - 1` removes the empty subset.

## Edge Cases

- Duplicate equal values are handled by `(1 << count) - 1`, the number of non-empty choices among those equal indices.
- A single value contributes all non-empty choices of its duplicates.

## Complexity

- Time: `O(n + u)`, where `u` is the number of distinct values.
- Space: `O(u)` for the frequency map.

## Notes

The approach relies on processing each chain from its minimum value. `HashMap` iteration order is arbitrary, but the `containsKey(cur - k)` guard ensures only chain starts are expanded.
