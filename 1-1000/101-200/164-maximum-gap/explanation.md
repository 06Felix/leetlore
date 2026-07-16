# Maximum Gap

## Idea

- The submitted implementation sorts the array with `Arrays.sort`.
- It then scans adjacent sorted values.
- The maximum adjacent difference found during the scan is returned.
- Arrays with fewer than two elements return `0`.

## Why It Works

- In sorted order, the maximum successive gap must occur between two adjacent sorted elements.
- Checking all adjacent pairs therefore considers every candidate gap.
- Sorting first guarantees no non-adjacent original positions matter.

## Edge Cases

- A single-element array returns `0`.
- Duplicate values may create zero gaps and do not require special handling.
- Already sorted or reverse-sorted input works after sorting.

## Complexity

- Time: $O(n \log n)$ due to sorting.
- Space: $O(1)$ or $O(\log n)$ extra depending on the JVM sort internals.

## Notes

- The problem asks for linear time and linear extra space; this accepted solution uses sorting, so it does not meet that follow-up-style restriction.
