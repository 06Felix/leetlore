## Idea
- Repeatedly inspect n modulo three and divide n by three.
- Reject a remainder of two; accept if all base-three digits are zero or one.

## Why It Works
- Each base-three position corresponds to one power of three, and distinct powers can appear only zero or one times.
- Base representation is unique, so a digit two cannot be replaced by another distinct-power representation.

## Edge Cases
- A power of three has one nonzero digit and qualifies.
- Values such as 12 have several one digits; values such as 21 contain a two and fail.

## Complexity
- O(log₃ n) time for successive divisions.
- O(1) auxiliary space.
