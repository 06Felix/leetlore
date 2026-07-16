# House Robber II

## Idea

- Because houses are circular, the first and last houses cannot both be robbed.
- The solution splits the problem into two linear robber cases: houses `0..n-2` and houses `1..n-1`.
- The helper computes the standard linear maximum using two rolling DP values.
- The answer is the larger result from the two ranges.

## Why It Works

- Any valid plan either excludes the last house or excludes the first house.
- Those two cases cover all legal circular plans.
- In a linear range, each position chooses between skipping the current house or robbing it plus the best value two positions back.
- Rolling `prev1` and `prev2` keep exactly the previous DP states needed for that recurrence.

## Edge Cases

- A single house returns its value.
- Two houses are handled by the two range calls and choose the larger value.
- Zero-valued houses are safe because skipping can match robbing them.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
