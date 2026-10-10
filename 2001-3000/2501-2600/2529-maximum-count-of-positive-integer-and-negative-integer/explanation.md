## Idea
- Scan the array, counting strictly positive and strictly negative values.
- Return the larger count and ignore zeros.

## Why It Works
- Each value falls into exactly one of positive, negative, or zero, so the counters are the required totals.
- Taking their maximum directly gives the requested answer.

## Edge Cases
- An all-zero array returns zero.
- Arrays entirely of one sign return their full length; repeated values are counted individually.

## Complexity
- O(n) time and O(1) auxiliary space.
- The implementation does not use the array's sorted order.

## Notes
- This solves the main problem but does not meet the optional O(log n) follow-up.
