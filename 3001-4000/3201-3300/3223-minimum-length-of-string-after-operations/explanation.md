# Explanation

## Idea
- Count each of the 26 letters.
- For every present letter, contribute one remaining occurrence if its count is odd, or two if its count is even.

## Why It Works
- Each operation removes exactly two occurrences of one letter, preserving its parity, and it requires at least three occurrences to proceed.
- Whenever a letter has at least three occurrences, an interior occurrence has matching neighbors on both sides, so another operation is possible regardless of intervening letters.
- Repeating independently for each letter leaves exactly one or two occurrences according to parity; no further operation can reduce those counts.

## Edge Cases
- Absent letters contribute zero; one or two copies of a letter cannot be reduced.
- Different letters' positions do not change the minimum, which depends only on their counts.

## Complexity
- Time: $O(n + 26)$ for counting and summing contributions.
- Space: $O(n + 26)$ for the `toCharArray` copy and frequency array.
