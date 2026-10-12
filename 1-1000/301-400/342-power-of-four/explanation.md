## Idea

- Recursively divide by four until reaching one; reject nonpositive values or values not divisible by four.

## Why It Works

- Each successful division removes one factor of four. Reaching one proves the input is exactly a nonnegative power of four.

## Edge Cases

- One returns true; zero and negative values return false.

## Complexity

- O(log₄ n) time and recursion space for positive n.

## Notes

- The implementation uses recursion, so it does not satisfy the optional follow-up asking for no loops or recursion.
