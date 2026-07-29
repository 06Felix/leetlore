# Count All Possible Routes

## Idea

- Use DFS with memoization on `(city, remainingFuel)`.
- A state contributes `1` route immediately if the current city is the finish, because stopping there is allowed.
- Try moving to every other city and subtract the fuel cost.

## Why It Works

- Future choices depend only on the current city and fuel left, not on the previous path.
- Memoizing `(city, fuel)` prevents recounting the same suffix routes.
- Counting the finish city before exploring outgoing moves includes routes that visit the finish and continue later.

## Edge Cases

- Negative fuel returns `0`, so invalid moves contribute nothing.
- `start == finish` counts the empty route and any valid routes that leave and return.
- The answer is reduced modulo `1_000_000_007` after additions.

## Complexity

- Time: `O(n^2 * fuel)` states and transitions.
- Space: `O(n * fuel)` for memoization plus recursion depth.
