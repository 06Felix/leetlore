# Explanation

## Idea
- Maintain one stack of unmatched indices for each letter.
- At each position, pop the mirror letter's stack if possible and add the index distance; otherwise push this position on its own letter's stack.

## Why It Works
- Each stack stores unmarked occurrences in increasing index order, so its top is the closest available earlier occurrence.
- Popping marks that earlier occurrence, and not pushing the current one marks it as used too. Otherwise storing it makes it available to later mirror letters.

## Edge Cases
- No prior mirror means no score change.
- Several unmatched mirrors are consumed newest first; repeated matches cannot reuse a popped index.

## Complexity
- Time: $O(n)$ amortized; each index is pushed and popped at most once.
- Auxiliary space: $O(n + 26)$ for the stacks.

## Notes
- The score uses `long`, since accumulated distances can exceed the integer range.
