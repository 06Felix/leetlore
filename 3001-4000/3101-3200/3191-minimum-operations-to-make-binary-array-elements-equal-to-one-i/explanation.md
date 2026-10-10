## Idea
- Scan possible flip starts from left to right. If the current bit is zero, count a flip and toggle only the next two bits.
- After processing every possible start, reject if either of the last two bits is zero.

## Why It Works
- Once earlier positions are settled, the only remaining flip that can repair a zero here starts at this position, so its choice is forced and minimal.
- The current bit would become one but is never examined again, so the implementation can omit writing that toggle. Updating the next two bits preserves all future decisions.

## Edge Cases
- All ones require zero operations.
- Any unresolved zero among the final two positions makes completion impossible because no legal flip can start there.

## Complexity
- O(n) time and O(1) auxiliary space.
- Each position triggers at most one flip.

## Notes
- nums is mutated, but processed current bits are not physically set to one. The array after the call need not equal the conceptual final all-one array even when the returned count is valid.
