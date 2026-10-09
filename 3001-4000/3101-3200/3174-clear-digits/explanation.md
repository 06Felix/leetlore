## Idea
- Use a StringBuilder as a stack of surviving letters.
- Append letters; for each digit, delete the builder's last character and decrement its tracked length.

## Why It Works
- Reading left to right processes digits in the required order.
- The last surviving letter is exactly the closest nondigit to the current digit's left, so popping it performs the required deletion.

## Edge Cases
- A string without digits is returned unchanged.
- Consecutive digits pop consecutive surviving letters; all characters may be removed.

## Complexity
- O(n) time: deletion is always at the end, so no remaining characters shift.
- O(n) auxiliary space for the character-array copy and builder.

## Notes
- The guarantee that all digits can be removed ensures a letter exists for every pop. Without it, deleteCharAt(-1) could throw.
