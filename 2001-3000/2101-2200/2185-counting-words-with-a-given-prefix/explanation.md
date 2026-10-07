# Explanation

## Idea
- Visit each word and call `startsWith(pref)`.
- Increment the answer for every successful prefix check.

## Why It Works
- `startsWith` tests exactly whether the word's leading characters equal the entire prefix.
- Each array entry is checked once, so the counter equals the number of qualifying entries.

## Edge Cases
- A word identical to the prefix qualifies.
- A shorter word cannot qualify; repeated qualifying entries are counted separately.

## Complexity
- Time: $O(nP)$ as an upper bound for `n` words and prefix length `P`.
- Auxiliary space: $O(1)$.
