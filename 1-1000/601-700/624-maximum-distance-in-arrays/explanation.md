# Explanation

Problem: [Maximum Distance in Arrays](https://leetcode.com/problems/maximum-distance-in-arrays/)

## Idea

- Track the smallest first element and largest last element seen in earlier arrays.
- For each new sorted array, try pairing its largest value with the previous minimum.
- Also try pairing its smallest value with the previous maximum.
- Update the global minimum and maximum after evaluating the current array.

## Why It Works

- The maximum distance using two different arrays must use one array's minimum and another array's maximum.
- When processing the current array, all previous arrays are valid partners and the current array is not yet included in `mn` or `mx`.
- Checking `currentMax - previousMin` and `previousMax - currentMin` covers both ways the current array can participate in the best pair.
- Updating after the check preserves the different-array constraint for later iterations.

## Edge Cases

- Arrays of length `1` work because first and last are the same.
- Equal values across arrays can yield distance `0`.

## Complexity

- Time: $O(m)$ for `m` arrays.
- Space: $O(1)$.

## Notes

- The implementation initializes sentinels outside the value constraint range.
