## Idea
- Track each colored ball's current color and each active color's ball count in two hash maps.
- For a query, increment the new color, decrement any previous color, remove zero counts, update the ball, and record the color map's size.

## Why It Works
- After each query, the frequency map contains exactly the colors used by at least one ball.
- Its size is therefore the distinct-color count. Incrementing before decrementing also handles recoloring a ball with its existing color safely.

## Edge Cases
- Previously uncolored balls have sentinel color zero, which cannot be a real color under the constraints.
- Removing the last ball of a color removes that color; sharing a color does not increase the distinct count.

## Complexity
- O(q) expected time for q hash-map updates.
- O(q) auxiliary space plus O(q) result space; storage depends on queried balls, not limit.
