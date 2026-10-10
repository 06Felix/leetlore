# Minimum Index of a Valid Split

## Idea
- Initialize a frequency map for the full right side and an empty frequency map for the left side.
- Move one value at a time to the left, checking whether that value has a strict majority in both sides.

## Why It Works
- A valid shared dominant value must also dominate the whole array, since its counts exceed half of both sides.
- The first valid split must end at an occurrence of that value: moving any other value weakens its left-side majority, and if the right side is dominant afterward it was dominant beforehand too.
- Therefore checking only the moved value still finds the earliest valid split; the maps maintain its exact counts on both sides.

## Edge Cases
- Strict `>` comparisons reject a value occurring exactly half the time.
- A one-element input returns `-1`. Although the loop visits the final index, the empty right side has count zero and cannot pass the majority test.

## Complexity
- Expected time: $O(n)$ assuming constant-time list indexing and hash-map operations.
- Space: $O(d)$ for $d$ distinct values across the two maps.

## Notes
- The implementation indexes `List<Integer>` repeatedly; a linked-list input would make indexing cost $O(n^2)$ overall.
- Zero-count entries remain in the right map, which does not affect the majority checks.
