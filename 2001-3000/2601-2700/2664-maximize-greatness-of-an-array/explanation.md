# Maximize Greatness of an Array

## Idea

- The solution sorts `nums`.
- `ans` tracks how many original sorted values have already been matched by a strictly larger value.
- It scans each sorted number as a candidate value for the permuted array.
- When `num > nums[ans]`, it can beat the smallest currently unmatched value, so `ans` increases.

## Why It Works

- Matching the smallest possible winning candidate to the smallest unmatched target leaves larger values available for later.
- Sorting makes this greedy pairing deterministic.
- If a candidate cannot beat `nums[ans]`, it cannot beat any larger unmatched value either, so skipping it is optimal.
- Each successful match contributes one index to the maximum greatness.

## Edge Cases

- All equal values produce `0` because no value can be strictly greater than another equal value.
- Strictly increasing arrays match every value except the largest.
- Duplicate values are handled naturally by the strict comparison.

## Complexity

- Time: $O(n \log n)$ due to sorting.
- Space: depends on the sort implementation; the scan itself is $O(1)$.
