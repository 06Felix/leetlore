## Idea

- Memoize the four equally likely serving choices, stopping when either soup is empty. Return 1 for n above 4800.

## Why It Works

- The recurrence enumerates every next serving outcome. For large equal amounts, A is overwhelmingly more likely to empty first, and the cutoff is within the accepted error tolerance.

## Edge Cases

- Simultaneous emptying contributes one half; negative remaining amounts use the same terminal rules.

## Complexity

- O(n²) states and O(n²) space below the cutoff.

## Notes

- The stored version uses 25-unit transitions directly rather than scaling the state.
