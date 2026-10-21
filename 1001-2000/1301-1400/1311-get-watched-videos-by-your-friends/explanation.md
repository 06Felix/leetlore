# Get Watched Videos by Your Friends

## Idea
- Run exactly `level` BFS layers from the selected person, marking people when enqueued.
- Count video occurrences among the people left in the frontier, then sort unique titles by increasing frequency and lexicographic order for ties.

## Why It Works
- BFS first reaches each person at their shortest friendship distance; fixed-size layer processing leaves precisely the people at the requested distance in the queue.
- Visit flags prevent the same person from contributing repeatedly through multiple friendship paths.
- The frequency map and two-part comparator produce exactly the requested ordering of titles watched by that frontier.

## Edge Cases
- If the requested level has no reachable people, the queue and returned list are empty.
- Titles shared by several frontier friends accumulate their occurrences; equal frequencies are resolved alphabetically.

## Complexity
- Expected $O(n+E+W+U\log U)$ time, where $W$ is the number of video entries counted and $U$ the number of distinct titles. Title comparisons have bounded length at most eight.
- $O(n+U)$ auxiliary space, plus the returned list.
