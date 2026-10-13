## Idea

- Store the last seen index plus one for each character in both strings. Reject positions whose two last-seen markers differ, then update both markers to the current position.

## Why It Works

- Equal last-seen positions mean the current characters have matched at precisely the same prior occurrence. A mismatch detects either one source mapping to multiple targets or multiple sources sharing one target. Inductively, matching occurrence histories establish the required bijection.

## Edge Cases

- Zero markers mean a character has never appeared. Self-mappings and repeated characters are allowed; the arrays cover all ASCII inputs.

## Complexity

- O(length) time and O(200) auxiliary space.
