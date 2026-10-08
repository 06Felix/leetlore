# Explanation

## Idea
- Scan characters with a stack: pop when the next character equals the top, otherwise push it.
- Pop the remaining characters into a builder and reverse it to restore their order.

## Why It Works
- The stack represents the reduced prefix, which has no adjacent equal letters.
- Appending a new character can create a removable pair only at the stack top. Canceling that pair or pushing the character maintains the invariant, including chain reactions across removed pairs.

## Edge Cases
- A string without duplicates remains unchanged.
- All characters can cancel; an odd run of one letter leaves one copy.

## Complexity
- Time: $O(n)$, since each character is pushed and popped at most once.
- Space: $O(n)$ for the stack, character-array copy, and output.
