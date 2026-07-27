# Explanation

Problem: [Find K-th Smallest Pair Distance](https://leetcode.com/problems/find-k-th-smallest-pair-distance/)

## Idea

- Sort `nums`.
- Binary search the distance value from `0` to `max - min`.
- For a candidate distance `m`, count how many pairs have distance at most `m`.
- The count uses a sliding right pointer because the array is sorted.
- Keep the smallest distance whose count is at least `k`.

## Why It Works

- The predicate "there are at least `k` pairs with distance `<= m`" is monotonic in `m`.
- Binary search on that monotonic predicate finds the smallest feasible distance.
- In sorted order, for each left index `i`, all valid right indices form one prefix ending before `j`.
- The counting helper adds exactly `j - i - 1` valid pairs for each `i`.
- The smallest feasible distance is exactly the kth value in the sorted list of pair distances.

## Edge Cases

- Duplicate values produce distance `0`, handled by the count.
- `k = 1` and the maximum possible `k` work through the same binary search.

## Complexity

- Time: $O(n \log n + n \log R)$, where `R = max(nums) - min(nums)`.
- Space: $O(1)$ extra after sorting.

## Notes

- The helper keeps `j` moving forward only, so each count pass is linear.
