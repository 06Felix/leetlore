# Remove Duplicate Letters

## Idea

- Count remaining character occurrences. Scan the string, skipping letters already selected; otherwise remove larger trailing selected letters while they appear again later, then append the current letter and mark it selected.

## Why It Works

- Replacing a larger available trailing letter with the current smaller letter improves lexicographic order. A letter is removed only when another copy remains, preserving the ability to include every distinct letter. The selected flag prevents duplicates, so greedy prefix improvements produce the minimum valid subsequence.

## Edge Cases

- A last remaining occurrence cannot be popped. Repeated copies of a selected letter still decrement the remaining count before being skipped.

## Complexity

- O(n) time and O(n) temporary space for toCharArray(); the builder and fixed character tables use constant space for the lowercase alphabet.

## Notes

- The input string is unchanged. Actual Java matched exhaustive valid-subsequence selection on 500 small random strings.
