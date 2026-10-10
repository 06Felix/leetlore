## Idea
- Maintain a sliding window and the bitwise OR of its values.
- Before adding a new value, remove leftmost values with XOR until the new value shares no set bit with the window; then OR it in and update the maximum length.

## Why It Works
- In a nice window each bit belongs to at most one value, so XOR removes exactly that value's bits from the OR mask.
- A zero AND with the mask means no existing value conflicts with the new one. Shrinking only until this holds retains the longest valid window ending at the current position.

## Edge Cases
- A singleton is always valid.
- Repeated positive values conflict, whereas disjoint bit patterns can coexist. Positive inputs make the code's AND > 0 test equivalent to nonzero.

## Complexity
- O(n) time because each endpoint advances at most n times.
- O(1) auxiliary space; input is unchanged.
