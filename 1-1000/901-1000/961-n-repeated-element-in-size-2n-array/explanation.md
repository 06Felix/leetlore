# N-Repeated Element in Size 2N Array

## Idea

- Insert values into a HashSet and return the first value whose insertion fails.

## Why It Works

- Every nonrepeated value occurs exactly once, so the only possible duplicate encountered is the value repeated n times. Its second occurrence must be reached before the scan ends.

## Edge Cases

- Zero is a valid repeated value. The repeated value need not occur in adjacent positions.

## Complexity

- Expected O(n) time and O(n) auxiliary space for an input of size 2n.

## Notes

- The fallback return value 911 is unreachable under the guaranteed input properties; it is not a general-purpose missing-duplicate indicator.
