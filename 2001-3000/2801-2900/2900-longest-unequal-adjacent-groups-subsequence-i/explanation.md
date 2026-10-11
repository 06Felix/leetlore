# Longest Unequal Adjacent Groups Subsequence I

## Idea
- Scan words in order and take a word whenever its group differs from the last selected group.
- Initialize the last group to `-1` so the first word is always selected.

## Why It Works
- Consecutive runs of one binary group contribute at most one word to an alternating subsequence.
- Selecting the first word of every run produces an alternating subsequence with one word per run, attaining that upper bound.

## Edge Cases
- One word is selected from an all-equal group array; an already alternating array selects every word.
- Word contents do not affect eligibility in this version of the problem, and selected references retain their original order.

## Complexity
- Time: $O(n)$ for one scan.
- Space: $O(n)$ for the output and $O(1)$ additional auxiliary storage.
