# Count Complete Subarrays in an Array

## Idea
- Count the whole array's distinct values, then maintain a sliding window with a fixed frequency array.
- Whenever the window contains every distinct value, advance its left edge until one value disappears; add the left pointer to the answer.

## Why It Works
- Removing the final occurrence of a value decreases the distinct count, preserving the window invariant.
- After shrinking, starts before the left pointer produce complete subarrays ending here, while the current start and all later starts are incomplete.
- Adding this count for each right endpoint counts every complete subarray exactly once.

## Edge Cases
- With one distinct value, every nonempty subarray qualifies; repeated occurrences do not increase the distinct count.
- The frequency array covers values through 2000. The answer fits `int` for length at most 1000.

## Complexity
- Expected time: $O(n+2000)$; each element enters and leaves the window at most once.
- Space: $O(d+2000)$ for the distinct-value set and frequency array, where $d$ is the total number of distinct values.
