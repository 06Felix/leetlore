# Majority Element II

## Idea

- The submitted implementation partitions the array recursively around a pivot value, similar to quicksort.
- It groups values equal to the pivot between indices `l` and `r`.
- If the equal group size is greater than `n / 3`, the pivot is added to the answer.
- It then recursively checks values smaller and larger than the pivot group.

## Why It Works

- Partitioning groups all occurrences of the pivot value into one contiguous block.
- A value can only be a majority candidate if its grouped block has more than `n / 3` elements.
- Recursing on the remaining partitions eventually considers other distinct values.
- The early return for ranges shorter than `n / 3` skips ranges that cannot contain a valid majority.

## Edge Cases

- Arrays of length one return that element.
- At most two values can appear more than `n / 3` times.
- The method mutates `nums` while partitioning.

## Complexity

- Average time: roughly $O(n \log n)$ with balanced partitions.
- Worst-case time: $O(n^2)$ with poor pivots.
- Space: $O(\log n)$ average recursion depth, worse if partitions are unbalanced.

## Notes

- This is not the standard Boyer-Moore $O(n)$, $O(1)$ solution requested by the follow-up, but it explains the accepted submitted implementation.
