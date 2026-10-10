## Idea
- Track seen values with a boolean array, recording the repeated value when it is encountered again.
- Sum only first occurrences, then subtract that distinct-value sum from the sum of integers one through n² to find the missing value.

## Why It Works
- The seen array detects the sole duplicate directly.
- After duplicates are excluded, the observed sum contains every required value except the missing one, so the sum difference is exactly that value.

## Edge Cases
- The missing or repeated value may be either endpoint of the allowed range.
- The guaranteed single duplicate and single missing value make the two-result interpretation unambiguous.

## Complexity
- O(n²) time and O(n²) auxiliary space for seen flags.
- Grid is unchanged; sums fit int for n <= 50.
