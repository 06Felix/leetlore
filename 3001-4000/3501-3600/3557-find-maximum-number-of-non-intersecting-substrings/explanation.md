# Find Maximum Number of Non Intersecting Substrings

## Idea
- Let `dp[i]` be the maximum number of valid nonoverlapping substrings within the first `i` characters.
- For each endpoint, retain the best `dp[start]` for each starting letter among starts at least three positions earlier, then optionally append a matching-letter substring.

## Why It Works
- Adding start `i - 4` before evaluating endpoint `i - 1` enforces a minimum substring length of four; older eligible starts remain available.
- `dp[start]` counts only substrings ending before the new substring starts, so concatenating this choice preserves nonintersection.
- Taking the maximum over skipping the endpoint and all eligible matching starts covers every possible optimal last substring.

## Edge Cases
- Strings shorter than four return zero.
- An unavailable starting letter retains a negative sentinel; repeated letters may support several disjoint substrings.

## Complexity
- Time: $O(n)$ with constant-time letter-state updates.
- Space: $O(n)$ for the character copy and prefix DP, plus 26 letter states.
