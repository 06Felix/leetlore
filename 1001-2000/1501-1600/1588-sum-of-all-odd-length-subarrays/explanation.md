# Explanation

## Idea
- Enumerate every start index and extend its subarray one endpoint at a time, maintaining a running sum.
- Add that sum whenever `i + j` is even.

## Why It Works
- Every contiguous subarray has a unique start and end, so the nested loops visit each exactly once.
- Its length `j - i + 1` is odd exactly when the endpoints have the same parity, equivalent to an even `i + j`.

## Edge Cases
- All singleton subarrays are included.
- An even-length full array is excluded, while its odd-length subarrays are still counted normally.

## Complexity
- Time: $O(n^2)$ for all endpoint pairs.
- Auxiliary space: $O(1)$; running sums avoid recomputing each subarray sum.

## Notes
- This implementation fits the main constraint `n <= 100`, but does not satisfy the optional $O(n)$ follow-up.
