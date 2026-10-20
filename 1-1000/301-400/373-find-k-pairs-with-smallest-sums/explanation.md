# Find K Pairs with Smallest Sums

## Idea

- Treat each nums1 index as a sorted row of pair sums across nums2. Seed a min-heap with the first pair from up to k rows; pop the smallest pair and advance only its row until k pairs have been returned.

## Why It Works

- Each row is nondecreasing. The heap holds the first unreturned pair from each seeded row, so merging its minima emits globally smallest pairs. Rows beyond the first k cannot be necessary for a k-element answer because k earlier row heads already have no greater sums.

## Edge Cases

- Repeated values represent different index pairs and may appear multiple times. Advancing a row stops at nums2.length.

## Complexity

- O((H + k) log(H + 1)) time and O(H) working space for H = min(k, nums1.length), plus O(k) output.

## Notes

- Both arrays must be sorted as guaranteed. Pair sums fit int under the bounds; the heap comparator uses subtraction of stored sums. The input arrays are unchanged.
