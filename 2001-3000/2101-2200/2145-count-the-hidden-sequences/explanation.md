# Count the Hidden Sequences

## Idea
- Compute prefix sums of the differences, including the initial zero, and track their minimum and maximum.
- Count starting values in the interval `[lower - minimum, upper - maximum]`, returning zero if it is empty.

## Why It Works
- Choosing the first hidden value determines the whole sequence by adding the prefix sums.
- Its smallest and largest values are the starting value plus the prefix minimum and maximum, so the two endpoint bounds are necessary and sufficient.

## Edge Cases
- Initializing both extrema to zero includes the first hidden value in the bounds.
- Prefix sums use `long` to avoid overflow; the final count fits `int` because it cannot exceed the allowed starting-value range.

## Complexity
- Time: $O(n)$ for one scan.
- Space: $O(1)$ auxiliary storage.
