# Mirror Reflection

## Idea

- Divide p and q by two while both are even. Return receptor 2 if the reduced p is even, receptor 0 if the reduced q is even, and receptor 1 otherwise.

## Why It Works

- Unfolding mirror reflections into tiled rooms makes the ray straight. The first corner crossing depends on the parity of horizontal and vertical tile counts, equivalent to q/gcd(p, q) and p/gcd(p, q). Removing common powers of two determines those parities; any remaining common odd factor cannot change them.

## Edge Cases

- Equal p and q reach receptor 1 immediately. After common twos are removed, at least one value is odd.

## Complexity

- O(log(min(p, q))) division steps and O(1) space.

## Notes

- The algorithm needs only parity, so it does not explicitly compute the full GCD or LCM.
