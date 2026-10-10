## Idea
- Return the closed form 1 + 2n(n - 1).
- Use long from the first multiplication to preserve the large result.

## Why It Works
- After the first colored cell, minute t adds the Manhattan-distance ring of 4(t - 1) cells.
- Summing those rings gives 1 + 4(1 + ... + n - 1) = 1 + 2n(n - 1).

## Edge Cases
- n = 1 gives one; n = 2 gives five.
- The largest allowed n produces a result beyond int but safely within long.

## Complexity
- O(1) time and O(1) auxiliary space.
- No grid construction or simulation is performed.
