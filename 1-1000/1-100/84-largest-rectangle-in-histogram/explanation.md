# Largest Rectangle in Histogram

## Idea

- Maintain a stack of nondecreasing-height indices. When a shorter bar arrives, pop taller bars and evaluate each height across the width bounded by the new stack top and the current index. An extra final iteration flushes the stack.

## Why It Works

- The current shorter bar closes the right boundary for each popped height. After popping, the remaining stack top supplies its left boundary, yielding width i - top - 1, or i when none remains. Every limiting bar is evaluated; equal-height runs eventually expose their widest span.

## Edge Cases

- Zero heights are valid. The final sentinel iteration evaluates rectangles extending to the array end.

## Complexity

- O(n) time and O(n) auxiliary space.

## Notes

- The code pushes index n only after flushing at the last iteration, and never dereferences that sentinel index. Areas fit int under the bounds. Actual Java matched 4000 brute-force histogram cases.
