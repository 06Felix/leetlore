## Idea

- Compress the word into run lengths. Multiply the run lengths for the unconstrained count. When there are fewer than k runs, use a DP over extra characters beyond one per run, saturating the extra count at k−runCount.

## Why It Works

- Each run independently retains between one and its observed length. dp[i][j] counts valid choices for runs i onward when j extra characters have already been accumulated, capped at the required threshold. The last row counts choices reaching that threshold. Sliding sums implement the transition over all possible lengths of the current run.

## Edge Cases

- If word length equals k, only the unchanged word qualifies. If the run count is already at least k, every choice qualifies. If k exceeds word length, no choice reaches the threshold.

## Complexity

- O(n+c(k−c+1)) time and O(c(k−c+1)) space when c<k; otherwise O(n+c) time and O(c) space, where c is the run count.

## Notes

- Counts are reduced modulo 10⁹+7. The DP recurrence matched brute enumeration on 896 small run-length/threshold cases.
