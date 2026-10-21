# Continuous Subarray Sum

## Idea

- Scan prefix sums modulo k and store the earliest index for each remainder, starting with remainder zero at index -1. Return true when the same remainder appears more than one index later.

## Why It Works

- Equal prefix remainders imply their intervening subarray sum is divisible by k. Keeping the earliest index maximizes the length available for each remainder, so any qualifying length-at-least-two interval is detected.

## Edge Cases

- The initial zero remainder permits intervals starting at index zero. Two consecutive zeroes qualify. A single element cannot satisfy the length requirement.

## Complexity

- Expected O(n) time and O(min(n, k)) auxiliary space under k > 0.

## Notes

- The total-sum bound and nonnegative values keep the rolling int additions safe. The k != 0 branch also avoids division by zero, though the current statement guarantees positive k.
