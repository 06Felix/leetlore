# Solving Questions With Brainpower

## Idea
- Fill a suffix DP array backward, where `dp[i]` is the maximum score obtainable starting at question `i`.
- Choose between skipping to `dp[i + 1]` and earning the current points plus `dp[i + brainpower + 1]` when that index exists.

## Why It Works
- Every legal plan either skips or solves its first available question; the recurrence covers both choices.
- Solving jumps past exactly the blocked questions, and backward iteration guarantees both future scores are already optimal.

## Edge Cases
- A jump beyond the array contributes no future points; the extra DP entry handles skipping the last question.
- One question returns its points. Scores use `long` because a valid total can exceed `int`.

## Complexity
- Time: $O(n)$ for $n$ questions.
- Space: $O(n)$ for the suffix DP array.
