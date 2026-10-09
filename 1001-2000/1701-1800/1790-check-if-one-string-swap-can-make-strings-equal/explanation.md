## Idea
- Scan corresponding characters, remembering the first mismatched pair using sentinel characters outside the lowercase alphabet.
- Accept a second mismatch only when its characters reverse the first pair, then mark the swap as complete. Reject any further mismatch.

## Why It Works
- One swap can affect only two positions. Two mismatches can be repaired exactly when their character pairs are reversed.
- No mismatch needs no swap; one mismatch cannot be fixed by a swap. The final sentinel test accepts precisely zero mismatches or a successfully matched pair.

## Edge Cases
- Identical strings return true, including length-one strings.
- Exactly one mismatch, more than two mismatches, or two mismatches without reversed characters return false.

## Complexity
- O(n) time for one scan.
- O(1) auxiliary space for the two remembered characters.

## Notes
- The sentinel scheme relies on the lowercase-English-letter constraint.
