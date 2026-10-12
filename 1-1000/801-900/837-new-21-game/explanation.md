## Idea

- Compute the probability of each score using a sliding sum of probabilities of scores that can still draw. Add scores at least k to the final answer.

## Why It Works

- An active predecessor reaches each next score with probability 1/maxPts. curSum maintains exactly the active predecessors within one draw’s range. Terminal scores are added to ans instead of reentering the active sum.

## Edge Cases

- k=0 returns one immediately. If n covers every possible terminal score through k+maxPts−1, the result is also one.

## Complexity

- O(n) time and O(n) space.
