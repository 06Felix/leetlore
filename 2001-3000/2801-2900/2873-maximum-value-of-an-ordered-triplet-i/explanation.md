# Maximum Value of an Ordered Triplet I

## Idea
- Scan left to right, tracking the largest earlier value and the largest nonnegative difference from an earlier ordered pair.
- Use the current value as the third element before updating the pair difference and largest value.

## Why It Works
- Positive third values make the greatest earlier difference the best choice for each final index.
- Updating the answer first ensures both pair indices precede the current index; updating the difference before the largest value also keeps the pair indices distinct.
- Zero initialization discards negative differences and preserves the required zero result when every triplet is negative.

## Edge Cases
- Increasing arrays and equal values yield zero; a useful large value must appear before its smaller middle value.
- Casting the difference to `long` before multiplication avoids overflow for values up to $10^6$.

## Complexity
- Time: $O(n)$ for one scan.
- Space: $O(1)$ auxiliary storage.
