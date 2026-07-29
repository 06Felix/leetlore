# Explanation

## Idea

- Process the string left to right with a stack.
- If the current character is `B` and the stack top is `A`, pop the `A` to remove `AB`.
- If the current character is `D` and the stack top is `C`, pop the `C` to remove `CD`.
- Otherwise push the current character.
- The stack size is the final minimized length.

## Why It Works

- The stack stores the reduced form of the processed prefix.
- Any new removable pair involving the current character must use the current top of that reduced prefix.
- Removing `AB` or `CD` immediately is safe because keeping an available removable pair cannot make a shorter result later.
- Popping can expose earlier characters, enabling cascading removals during later iterations.

## Edge Cases

- Strings with no removable pairs keep their full length.
- Cascading cases work because the stack top updates after every pop.
- Empty-stack checks prevent invalid top access.

## Complexity

- Time: `O(n)`.
- Space: `O(n)`.
