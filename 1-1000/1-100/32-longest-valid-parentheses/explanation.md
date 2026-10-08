# Explanation

## Idea
- Prepend a non-parenthesis sentinel and let `dp[i]` record the longest valid substring ending at position `i`.
- For a closing parenthesis, check the character just before the preceding valid suffix. If it is an opening parenthesis, wrap that suffix and add any valid substring ending before the new opening.

## Why It Works
- A valid suffix ending at a closing parenthesis must match that closing with the opening immediately before its inner valid suffix.
- The recurrence adds the inner length, two matching parentheses, and the preceding valid suffix, covering both nested and concatenated structures. The largest ending length is the global answer.

## Edge Cases
- Empty input and unmatched characters leave counts zero.
- The sentinel prevents matching before the original string starts and makes the preceding DP access valid whenever an opening match is found.

## Complexity
- Time: $O(n)$ for the recurrence and maximum scan.
- Auxiliary space: $O(n)$ for the copied string and DP array.
