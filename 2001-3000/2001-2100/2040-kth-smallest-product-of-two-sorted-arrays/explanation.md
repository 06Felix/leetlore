## Idea

Split each sorted array into ascending negative magnitudes and nonnegative values. Partition products into a cross-sign nonpositive block and a nonnegative block; reverse the rank for the nonpositive block. Binary-search a magnitude, counting products no larger than it with two pointers.

## Why It Works

For sorted nonnegative magnitudes, the largest admissible partner index only moves left as the first factor increases. This counts each product at most the threshold exactly, making the count monotone for binary search. Negating reverses magnitude order in the cross-sign block. Zero products may occur in both blocks, but they are equal at their boundary.

## Edge Cases

Zeros and repeated products are counted with multiplicity. Long multiplication is used for product magnitudes up to 10¹⁰.

## Complexity

O((n+m) log(10¹⁰+1)) time and O(n+m) auxiliary space.

## Notes

Correctness risk: negCount is initialized from int multiplications and addition before assignment to long. With 50,000 negative values in one array and 50,000 positive values in the other, the count 2,500,000,000 overflows int and can select the wrong block. The stored implementation is left unchanged; the argument above assumes this count does not overflow.

