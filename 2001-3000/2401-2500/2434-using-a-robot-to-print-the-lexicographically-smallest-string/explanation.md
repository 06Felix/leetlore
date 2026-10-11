# Using a Robot to Print the Lexicographically Smallest String

## Idea
- Count unread letters and push input characters onto a stack one at a time.
- Pop and print whenever the stack top is at most the smallest unread character; after input exhaustion, drain the remaining stack.

## Why It Works
- If a smaller unread character exists, delaying the stack top allows that smaller character to be printed first.
- If no unread character is smaller, printing the top immediately cannot worsen the next output character; repeating this choice produces the lexicographically smallest legal output.
- The stack directly models the robot's last-in-first-out buffer, preserving the permitted operation order.

## Edge Cases
- Equal stack-top and unread-minimum letters may be printed immediately without losing optimality.
- When no unread letters remain, the helper returns `a`; this may leave other letters on the stack, but the final drain prints them in their only legal order.

## Complexity
- Time: $O(26n)$, since each character is pushed and popped once and each minimum lookup scans at most 26 counts.
- Space: $O(n)$ for the input character copy, stack, and output.
