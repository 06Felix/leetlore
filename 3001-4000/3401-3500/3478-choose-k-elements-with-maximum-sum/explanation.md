## Idea
- Sort indices by nums1. As each index is answered, advance a separate pointer to insert all strictly smaller nums1 entries into a min heap.
- Keep only the k largest eligible nums2 values and maintain their long sum; store that sum at the index's original position.

## Why It Works
- The advancing pointer introduces each eligible value once and excludes entries equal to the current nums1 value.
- Replacing the smallest retained value whenever a larger value arrives preserves the k-largest set. Positive values mean choosing all available values up to k maximizes the sum.

## Edge Cases
- Equal nums1 values receive the same answer and cannot contribute to each other.
- The smallest nums1 group receives zero; fewer than k eligible entries are all retained.

## Complexity
- O(n log n + n log(k + 1)) time for index sorting and heap updates.
- O(n + k) auxiliary/result space for sorted indices, answers, and the heap.
