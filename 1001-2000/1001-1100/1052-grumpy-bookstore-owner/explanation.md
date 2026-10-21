# Grumpy Bookstore Owner

## Idea
- Add customers from naturally non-grumpy minutes to a fixed baseline.
- Slide a window of at most `minutes` entries, counting only customers from grumpy minutes. Add its greatest gain to the baseline.

## Why It Works
- Naturally satisfied customers count regardless of where the technique is used; only grumpy minutes can contribute extra satisfaction.
- Adding the incoming grumpy contribution and subtracting the departing one maintains the current window's extra customers.
- Every full window is inspected. Early shorter windows cannot overstate the optimum because their contributions are nonnegative and they can be extended to a full window.

## Edge Cases
- All non-grumpy minutes give zero extra gain; an all-grumpy input reduces to a maximum fixed-window sum.
- `minutes = n` satisfies every customer; zero-customer minutes need no special handling.

## Complexity
- $O(n)$ time and $O(1)$ auxiliary space.
- Inputs are unchanged; the maximum total of $2\cdot10^7$ fits in `int`.
