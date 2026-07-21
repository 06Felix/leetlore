# Intersection of Two Arrays II

## Idea

- Always build counts from the smaller array.
- Count each number from that array in a hash map.
- Scan the larger array and take a number only while its remaining count is positive.
- Convert the collected list to an `int[]`.

## Why It Works

- The intersection multiplicity of a value is the minimum of its counts in both arrays.
- The count map limits how many copies can be emitted.
- Scanning the other array emits one result for each matched available copy.
- Swapping arrays first reduces map size without changing the intersection.

## Edge Cases

- No overlap returns an empty array.
- Duplicates are included up to the smaller frequency.
- Output order can follow `nums2` because any order is accepted.

## Complexity

- Time: $O(n + m)$.
- Space: $O(\min(n, m))$ for the count map, excluding output.
