# Bulls and Cows

## Idea

- The solution scans both strings once.
- Matching positions are counted as bulls.
- For non-matching positions, digit counts are stored separately for `secret` and `guess`.
- Cows are the sum of the minimum unmatched count for each digit.

## Why It Works

- Bulls must be excluded before counting cows because they are already exact matches.
- For each digit, only unmatched occurrences can contribute to cows.
- The number of cow matches for a digit is limited by the smaller unmatched count between `secret` and `guess`.
- Summing across digits gives the total number of cows.

## Edge Cases

- Duplicate digits are handled by count arrays.
- All positions matching gives zero cows.
- No matching digits gives zero bulls and possibly cows from count overlap.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$ for fixed digit counts.
