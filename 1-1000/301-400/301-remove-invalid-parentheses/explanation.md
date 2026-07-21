# Remove Invalid Parentheses

## Idea

- First compute the exact number of unmatched left and right parentheses to delete.
- DFS removes exactly those counts.
- Skip duplicate removal choices when equal parentheses appear at the same recursion level.
- When no removals remain, validate the candidate and add it if balanced.

## Why It Works

- `delC` computes the minimum removals needed to balance the string.
- DFS only performs that many removals, so every accepted result has minimum deletion count.
- Skipping repeated identical removals prevents duplicate output strings.
- `isV` confirms that remaining parentheses never close before opening and end balanced.

## Edge Cases

- Letters are never removed.
- Inputs like `")("` can reduce to the empty string.
- Already valid strings have zero removals and are returned unchanged.

## Complexity

- Time: exponential in the number of parentheses, bounded by the generated deletion combinations.
- Space: $O(n)$ recursion depth plus output.
