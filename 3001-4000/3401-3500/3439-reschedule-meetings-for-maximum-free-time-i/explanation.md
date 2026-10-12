## Idea

- Compute all n+1 free gaps and their prefix sums. Return the largest sum of k+1 consecutive gaps.

## Why It Works

- Packing the k meetings between consecutive gaps to one side merges those gaps without changing meeting order or duration. Any resulting free interval can cross at most k moved meetings, so it cannot exceed such a gap sum. Since gaps are nonnegative, extending a smaller window to k+1 gaps cannot reduce its sum.

## Edge Cases

- With k=n, all free time can be combined. Zero-length gaps work naturally, including fully occupied schedules.

## Complexity

- O(n) time and O(n) auxiliary space.
