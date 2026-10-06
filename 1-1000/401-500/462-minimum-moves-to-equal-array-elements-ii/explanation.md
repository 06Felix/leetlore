# Explanation

## Idea
- Compute `statistics.median(nums)`, convert that median to an integer, and sum each element's absolute distance from it.
- This is the imported Python solution; it uses the standard library's median calculation rather than an explicit selection algorithm.

## Why It Works
- For a sorted pair of opposite-end elements, any target between them minimizes their combined absolute distance.
- A median lies in all such minimizing intervals, so it minimizes the total number of increments and decrements.
- For even lengths, any integer between the two middle values is optimal. Truncating their average toward zero still chooses an integer in that interval.

## Edge Cases
- A single element or an already equal array requires zero moves.
- Negative numbers and even-length arrays follow the same median rule; Python integers avoid arithmetic overflow.

## Complexity
- Time: $O(n \log n)$ because the standard median implementation sorts the input values, followed by an $O(n)$ distance sum.
- Auxiliary space: $O(n)$ for the sorted copy; the generator avoids building a separate distance list.

## Notes
- The solution assumes `statistics` is available in the judge environment; the imported file does not include its import.
