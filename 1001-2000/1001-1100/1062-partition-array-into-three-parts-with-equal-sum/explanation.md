# Partition Array Into Three Parts With Equal Sum

## Idea

- Compute the total sum first.
- If it is not divisible by `3`, equal partitioning is impossible.
- Otherwise scan left to right, counting segments whose running sum reaches `sum / 3`, then reset the segment sum.

## Why It Works

- Three equal parts must each sum to one third of the total.
- Every time the running segment sum reaches that target, one valid consecutive part has been found.
- Finding at least three such parts means the array can be split into three non-empty equal-sum parts, with any extra zero-sum cuts absorbed by the third-part condition.

## Edge Cases

- Negative numbers work because the scan uses sums, not monotonic assumptions.
- Total sum `0` is handled by target `0`; each zero-sum segment is counted.
- Arrays with fewer than three target segments return `false`.

## Complexity

- Time: `O(n)`, where `n` is `arr.length`.
- Space: `O(1)`.
