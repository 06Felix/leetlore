## Idea
- Compute each number's decimal digit sum and store the largest earlier number in that bucket.
- If the bucket is nonempty, test its maximum plus the current number, then update the bucket maximum.

## Why It Works
- For a fixed current number, the largest earlier number with the same digit sum gives its best possible pair.
- Testing before updating uses different indices, and scanning all numbers considers every possible optimal pair when its later member arrives.

## Edge Cases
- A singleton or no repeated digit sum returns -1.
- Equal values at different indices can pair. Zero is a safe empty-bucket sentinel because input values are positive.

## Complexity
- O(n log M) time for digit extraction, with at most ten digits per number under the constraints.
- O(1) auxiliary space: 82 buckets cover digit sums up to 81 for values at most 10^9.
