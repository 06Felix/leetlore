## Idea
- Scan each value and reject it if either existing neighbor at distance k is at least as large.
- Add the value when it passes all applicable comparisons.

## Why It Works
- The rejection checks are exactly the negation of the required strict comparisons.
- Missing neighbors impose no condition, so every accepted value and only an accepted value contributes once.

## Edge Cases
- Equal compared values fail because the comparison must be strict.
- Near array ends only one comparison may exist; if neither exists, the value qualifies.

## Complexity
- O(n) time with at most two comparisons per value.
- O(1) auxiliary space; nums is unchanged.
