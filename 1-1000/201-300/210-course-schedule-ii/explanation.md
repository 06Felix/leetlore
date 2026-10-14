## Idea

- Build edges from prerequisites to dependent courses, count indegrees, and repeatedly queue courses whose remaining indegree is zero. Return the order only if all courses are taken.

## Why It Works

- A zero-indegree course has no unfinished prerequisite. Removing its edges exposes exactly the newly available courses. A directed cycle leaves some courses with unmet dependencies, preventing complete processing; otherwise the produced order respects every edge.

## Edge Cases

- Independent courses start in the queue. Empty prerequisite lists allow all courses immediately.

## Complexity

- O(V+E) time and space.
