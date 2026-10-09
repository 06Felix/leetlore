## Idea
- Count the length of each maximal run of equal characters.
- When the character changes, test whether the completed run has length k. Test the last run after the loop as well.

## Why It Works
- A uniform substring satisfies both boundary conditions exactly when it is a whole maximal run.
- Checking every run for length exactly k therefore finds every valid substring without accepting a shorter slice of a longer run.

## Edge Cases
- Runs at either end need only their existing boundary checked.
- A singleton qualifies for k = 1; a longer uniform string qualifies only when k equals its full length.

## Complexity
- O(n) time for one scan.
- O(n) auxiliary space because the implementation copies s into a character array.
