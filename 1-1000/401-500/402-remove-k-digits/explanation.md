## Idea
- Maintain a digit stack. While deletions remain, remove larger trailing digits before pushing a smaller incoming digit.
- Remove any leftover quota from the stack's end, reverse it, strip leading zeros from its top, and pop into the result.

## Why It Works
- At the first differing position, the smaller digit produces the smaller number, so removing a larger preceding digit is the best available deletion.
- If no such improvement remains, deleting the final digits preserves the smallest prefix. Reversing enables output in original order, and zero stripping normalizes its representation.

## Edge Cases
- Removing every digit returns zero immediately.
- Increasing or equal-digit inputs use the remaining end deletions. An all-zero result retains one zero.

## Complexity
- O(n) time: every digit is pushed and popped at most once, with linear reversal and output.
- O(n) auxiliary space for the stack, character copy, and builder.
