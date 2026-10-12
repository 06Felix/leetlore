## Idea

- Sort a copy to find the k-th largest threshold. Keep every larger value and only enough threshold-equal values to reach k, scanning the original array.

## Why It Works

- The k largest values maximize the sum. Threshold ties have equal contribution, and the original-order scan makes the selected values a subsequence.

## Edge Cases

- Negative values remain eligible. With k = n every value is returned.

## Complexity

- O(n log n) time and O(n+k) space.
