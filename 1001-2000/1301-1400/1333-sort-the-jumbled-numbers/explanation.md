# Explanation

Problem: [Sort the Jumbled Numbers](https://leetcode.com/problems/sort-the-jumbled-numbers/)

## Idea

- For every number, compute its mapped value digit by digit.
- Store triples: mapped value, original index, original number.
- Sort triples by mapped value, using original index as the tie-breaker.
- Return the original numbers in that sorted triple order.

## Why It Works

- `getMapped` applies the given digit mapping to every digit, so each triple contains the correct sort key.
- Sorting by mapped value gives the requested non-decreasing mapped order.
- When mapped values tie, sorting by original index preserves the original relative order.
- The final array uses the stored original number, so values are sorted by mapped value but not replaced.

## Edge Cases

- `0` maps through the single digit `'0'`.
- Leading zeroes in mapped values naturally collapse because the mapped value is stored as an integer.

## Complexity

- Time: $O(n d + n \log n)$, where `d` is the max digit count.
- Space: $O(n)$.

## Notes

- The implementation uses `List<int[]>` and a stream conversion for clarity.
