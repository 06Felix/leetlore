# Explanation

## Idea

Build prefix sums, then fix the end of the left subarray. For each left end `i`, maintain two moving pointers:

- `j`: first middle end where `leftSum <= midSum`
- `k`: first middle end where `midSum > rightSum`

Then every middle end in `[j, k)` is valid.

## Why It Works

Because all numbers are non-negative, prefix sums are nondecreasing. As `i` moves right, the valid lower and upper bounds for the middle end never move left.

The first while loop advances `j` until the middle sum is large enough. The second advances `k` while the middle sum is still no larger than the right sum.

So `k - j` counts exactly the valid splits for this fixed left part.

## Edge Cases

- All three parts must be non-empty, so `i < n - 2` and middle pointers stay below `n - 1`.
- Zero values are handled because prefix sums are still nondecreasing.
- The answer is reduced modulo `1_000_000_007`.

## Complexity

Time: `O(n)`.

Space: `O(n)`.
