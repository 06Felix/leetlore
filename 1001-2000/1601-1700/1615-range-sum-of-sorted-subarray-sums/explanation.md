# Explanation

Problem: [Range Sum of Sorted Subarray Sums](https://leetcode.com/problems/range-sum-of-sorted-subarray-sums/)

## Idea

- Treat subarray sums that start at each index as sorted streams, because all `nums` values are positive.
- Initialize a min-heap with each length-one subarray sum.
- Repeatedly pop the smallest current subarray sum.
- After popping a stream entry, extend that same subarray one position to the right and push it back.
- Add popped values whose sorted rank is between `left` and `right`.

## Why It Works

- For a fixed start index, extending the subarray only increases its sum, so each start index produces a nondecreasing stream.
- The heap always contains the smallest not-yet-output sum from each active stream.
- Popping the heap therefore emits the global sorted sequence of all subarray sums one by one.
- Extending the popped stream preserves the invariant that the heap has the next candidate from that stream.
- Summing ranks `left..right` of this emitted order gives the requested result.

## Complexity

- Time: $O((right + n) \log n)$.
- Space: $O(n)$.

## Notes

- The implementation uses a `Pair` helper and includes explicit import lines in the archived solution.
