## Idea
- Compute the shortest supersequence length for every pair of string prefixes.
- Matching final characters use one character plus the diagonal state; differing characters use one plus the shorter state obtained by dropping either final character.
- Backtrack from the full prefixes, append selected characters in reverse, add the remaining prefix, then reverse the builder.

## Why It Works
- Equal final characters can be shared by both subsequences. Otherwise the final supersequence character comes from one string, leaving the corresponding smaller prefix problem.
- Following minimizing transitions preserves both strings' order and constructs a supersequence whose length matches the optimal DP value.

## Edge Cases
- Identical strings are returned without duplication.
- A tie takes str2's character, which is valid because any shortest result is allowed. Leftover characters are appended after one prefix is exhausted.

## Complexity
- O(ab) time for prefix DP plus O(a + b) reconstruction.
- O(ab + a + b) space for DP, character copies, and result, where a and b are the string lengths.
