## Idea

- Try operation counts t from zero through 60. Test whether x=num1−t·num2 can be written as exactly t powers of two, using popcount(x)≤t≤x.

## Why It Works

- The binary expansion uses the fewest power-of-two terms, popcount(x). Splitting a power into two equal halves increases the term count by one until all terms are ones, so every count through x is attainable. The first feasible t is minimal.

## Edge Cases

- Negative x or x<t is rejected. Long arithmetic handles the products for negative num2.

## Complexity

- O(60) fixed-width operations and O(1) space.

## Notes

- The bound is sufficient here: if num2<0, t=60 has x≥60 and fewer than 60 set bits. For num2≥0, any feasible t>60 would imply x at t=60 is at least 60 with at most 30 set bits, so 60 would already be feasible.
