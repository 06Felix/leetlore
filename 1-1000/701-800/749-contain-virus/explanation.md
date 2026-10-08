# Explanation

## Idea
- Each day, discover active infected components and record their infected cells, distinct threatened uninfected cells, and infected-to-uninfected boundary-edge counts.
- Use a priority queue to quarantine the component threatening the most distinct cells, add its required walls, and mark it with value two.
- Spread every other component into its precomputed frontier, then rebuild components for the next day.

## Why It Works
- The threat set deduplicates a cell touched by several infected neighbors, while each such boundary still requires its own wall edge.
- All frontiers are computed before any spreading, modeling simultaneous overnight infection. Quarantined cells are ignored by future searches and spread.
- Repeating the statement's uniquely determined quarantine choice yields exactly the required wall total.

## Edge Cases
- Regions can merge after spreading and are rediscovered together on the next day.
- A region with no frontier needs zero walls; quarantining it cannot increase the answer.

## Complexity
- Let `N = mn` and `D` be the number of simulated days.
- Time: $O(DN\log(N+1))$ as an upper bound for component scans and priority-queue processing; $D \le N$.
- Auxiliary space: $O(N)$ for visited flags, component sets, the heap, and recursion.

## Notes
- The input grid is changed to represent infection and quarantine.
- Flood fill can recurse through an entire region of up to 2500 cells; stack capacity depends on the Java runtime.
