# Explanation

Problem: [Scramble String](https://leetcode.com/problems/scramble-string/)

## Idea

- Use recursion with memoization on pairs of substrings.
- If the two substrings are equal, return true immediately.
- Before trying splits, compare character counts; mismatched counts cannot form a scramble.
- For every split point, try both cases: the left/right parts stay aligned, or they are swapped.

## Why It Works

- A scramble is formed by recursively splitting a string and optionally swapping the two children.
- Trying every split covers every possible first split of a valid scramble tree.
- For each split, checking both swapped and non-swapped recursive pairings matches the only two ways the two children can correspond.
- Memoization preserves the result for each substring pair, avoiding repeated work without changing the recurrence.

## Edge Cases

- Equal substrings return true without further recursion.
- Different character multisets return false even if lengths match.
- Single-character substrings are handled by the equality and count checks.

## Complexity

- Time: exponential in the worst case, reduced substantially by memoization over substring pairs.
- Space: $O(n^3)$ memo entries in the usual substring-state view, plus recursion and substring objects.

## Notes

- The implementation builds memo keys from the actual substring contents and uses `substring`, so Java string allocation contributes meaningful overhead.
