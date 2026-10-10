## Idea
- Run maximum-sum and minimum-sum Kadane recurrences together, tracking extrema among subarrays ending at each position.
- Update the answer with the maximum ending sum or the negation of the minimum ending sum.

## Why It Works
- Every optimal ending subarray either starts at the current value or extends the corresponding best previous ending subarray.
- The greatest absolute sum is the larger of the greatest positive sum and the magnitude of the most negative sum, so scanning both recurrences covers every candidate.

## Edge Cases
- All-positive arrays favor their full sum; all-negative arrays favor the magnitude of their full sum.
- All zeros return zero, consistent with the allowed empty subarray. Nonempty inputs guarantee the initial answer is replaced.

## Complexity
- O(n) time with two constant-size updates per element.
- O(1) auxiliary space; sums stay within int under the given bounds.
