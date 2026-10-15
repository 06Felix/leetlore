# Maximum Subarray Sum With Length Divisible by K

## Idea

- Maintain a running prefix sum and the smallest previous prefix for each ending-index remainder modulo k. Subtract the matching minimum to form a candidate, then update that remainder’s minimum.

## Why It Works

- A subarray length is divisible by k exactly when its two prefix boundaries have the same remainder. Subtracting the smallest matching earlier prefix maximizes the sum ending at the current position. Updating after querying excludes empty subarrays.

## Edge Cases

- The empty prefix is represented by remainder k - 1 because array ending indices are used. All-negative inputs still return a nonempty subarray sum.

## Complexity

- O(n + k) time and O(k) auxiliary space.

## Notes

- Unseen remainder slots use Long.MAX_VALUE / 2. Their initial artificial candidates are far below any real valid sum under the constraints; k <= n guarantees a real candidate. All prefix sums and answers use long.
