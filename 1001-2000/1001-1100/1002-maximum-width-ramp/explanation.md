# Explanation

## Idea

- Build a stack of candidate left indices whose values are strictly decreasing.
- These are the only useful starts, because any later index with a greater or equal value is dominated by an earlier one.
- Scan right indices from the end.
- While the right value can pair with the stack top, update the answer and pop that left index.

## Why It Works

- A ramp wants the smallest possible left index for a given value threshold.
- The decreasing stack preserves exactly those non-dominated left candidates.
- Scanning `j` from right to left means the first valid right endpoint found for a candidate left index gives its maximum possible width.
- Once a left candidate is matched and popped, no later scan position can give it a wider ramp.

## Edge Cases

- Strictly decreasing arrays never pop a valid pair, so the answer remains `0`.
- Equal values are valid ramp endpoints because the comparison uses `>=`.
- The right scan stops at `i > ans`, since no smaller right index can improve the current width.

## Complexity

- Time: `O(n)`.
- Space: `O(n)`.
