## Idea

- Start a memoized DFS in each diagonal direction from every one. After entering a cell, continue toward the next alternating value or use the single permitted clockwise turn.

## Why It Works

- Each state is determined by its cell, direction, and whether a turn remains. The expected next value is determined by the current zero or two, so it need not appear in the memo key. Trying straight and clockwise continuation covers every allowed path; maximizing over all starts finds the longest.

## Edge Cases

- No one returns zero. An isolated one gives length one. Turning consumes the turn allowance, so a second turn is impossible.

## Complexity

- O(rows·columns) time and space for eight states per cell; recursion depth is O(rows+columns).

## Notes

- The direction array is ordered clockwise, making (dir+1)%4 the permitted turn.
