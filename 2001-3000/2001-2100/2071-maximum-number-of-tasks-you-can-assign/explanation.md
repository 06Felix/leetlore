# Maximum Number of Tasks You Can Assign

## Idea
- Sort tasks and workers, then binary-search how many tasks can be assigned.
- For a candidate count, use the easiest tasks and strongest workers, storing worker strengths with multiplicities in a TreeMap.
- Process tasks hardest first: take the weakest worker able to do the task without a pill, or, if none exists, spend a pill on the weakest worker able to do it after the boost.

## Why It Works
- Replacing selected tasks with easier ones and selected workers with stronger ones cannot hurt feasibility.
- A worker meeting the requirement naturally can handle the hardest remaining task without spending a pill. Swapping it into that role preserves the displaced stronger worker for any easier task.
- If no worker qualifies naturally, a pill is necessary. Choosing the weakest boosted candidate preserves stronger workers for later tasks; an exchange with any feasible assignment keeps the remaining easier task feasible.
- Feasibility is monotone in the count, so binary search finds the largest achievable value.

## Edge Cases
- Zero candidate tasks succeeds; repeated strengths are retained as map counts and removed only when exhausted.
- No pills or a zero boost are handled by the same checks. `task - strength` remains within `int` under the constraints.

## Complexity
- Time: $O(n\log n+m\log m+K\log(K+1)\log(K+1))$, where $K=\min(n,m)$.
- Space: $O(K)$ for the worker multiset, plus sorting stack space.

## Notes
- Both input arrays are sorted in place.
- A fresh worker multiset and pill count are used for each feasibility check.
