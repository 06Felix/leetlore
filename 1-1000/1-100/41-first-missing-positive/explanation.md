# First Missing Positive

## Idea

- Repeatedly place any value v in [1, n] at index v - 1 by swapping, stopping when its destination already contains v. Scan for the first index missing its expected value i + 1, otherwise return n + 1.

## Why It Works

- The smallest missing positive must lie in [1, n + 1]. Each successful swap puts a useful value into its canonical slot; the destination inequality prevents duplicate cycles. After placement, the first unfilled canonical slot identifies the smallest absent positive.

## Edge Cases

- Nonpositive and oversized values are ignored. Duplicates cannot cause an infinite loop.

## Complexity

- O(n) time and O(1) auxiliary space: each successful swap fixes a useful value’s destination.

## Notes

- nums is reordered in place. Short-circuit bounds checks protect the value-based index even for extreme int inputs. Actual Java matched 2000 reference-set cases.
