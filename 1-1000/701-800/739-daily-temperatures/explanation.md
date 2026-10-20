# Daily Temperatures

## Idea

- Keep unresolved day indices on a stack with nonincreasing temperatures. A strictly warmer current day pops eligible indices and records the index difference.

## Why It Works

- An unresolved day has not encountered any earlier warmer future day. The first day that pops it is therefore exactly the next warmer day; indices left on the stack have no such day and retain zero.

## Edge Cases

- Equal temperatures do not resolve each other. The final day always returns zero.

## Complexity

- O(n) time and O(n) auxiliary space, plus the output.

## Notes

- Each day index enters and leaves the stack at most once. The temperature array is unchanged.
