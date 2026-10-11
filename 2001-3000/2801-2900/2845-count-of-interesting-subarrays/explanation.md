# Count of Interesting Subarrays

## Idea
- Treat each value as one if its remainder equals `k`, otherwise zero, and maintain the prefix count modulo `mod`.
- For each prefix remainder `pf`, count earlier prefixes with remainder `(pf - k + mod) % mod`, then insert the current prefix.

## Why It Works
- A subarray's matching-element count is the difference between its two prefix counts.
- That difference is congruent to `k` exactly when the earlier prefix has the requested remainder. Stored frequencies count every such starting boundary.
- Seeding remainder zero with one includes subarrays starting at the first element; querying before insertion excludes empty subarrays.

## Edge Cases
- `k = 0` allows subarrays with no matching elements, as well as counts that are multiples of the modulus.
- Modulus one makes every subarray interesting. The normalized remainder expression remains within `int` under the given bounds, and the answer uses `long`.

## Complexity
- Expected time: $O(n)$ for one pass and hash-map operations.
- Space: $O(\min(n+1,mod))$ stored prefix remainders.
