## Idea

Sort the values and greedily extend each group while its maximum stays within k of its minimum. Start another group when that bound is exceeded.

## Why It Works

A group containing the smallest unused value cannot include anything above minimum + k. Taking every available value within that bound leaves no more work than taking a smaller group, so this greedy choice minimizes the group count. Each chosen value group can retain its original index order to form a subsequence.

## Edge Cases

Equal values share a group; k = 0 groups equal values only.

## Complexity

O(n log n) time and O(log n) sorting stack.

## Notes

Sorting modifies the input array.
