# Explanation

## Idea
- Scan with a character stack, canceling the top and current character when their numeric codes differ by 32.
- Otherwise push the current character; reverse the popped remainder to construct the result.

## Why It Works
- For the allowed English letters, difference 32 identifies opposite-case forms of the same letter.
- The stack stores a good reduced prefix. Only its boundary with the new character can become bad, and canceling there preserves the invariant while allowing later chain reactions.

## Edge Cases
- Same-case equal letters are retained.
- A singleton remains unchanged, and complete cancellation yields the valid empty string.

## Complexity
- Time: $O(n)$ for stack processing and output construction.
- Auxiliary space: $O(n)$ for the stack, temporary character array, and builder.
