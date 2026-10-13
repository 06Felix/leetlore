## Idea

- Sort, fix one distinct first value, and find zero-sum pairs in the remaining suffix using two pointers. Skip equal first values and equal pair endpoints after each match.

## Why It Works

- For a fixed first value, sorted order makes pointer moves eliminate only sums that cannot reach zero. Every triplet has one smallest-index anchor, and duplicate skipping emits each value triplet exactly once.

## Edge Cases

- Three zeros produce one triplet. Repeated values remain usable at separate indices but do not duplicate output.

## Complexity

- O(n²) time, O(log n) sorting stack, and O(output size) result space.

## Notes

- Sorting modifies nums; sums fit int under the supplied value bounds.
