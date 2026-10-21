# Sum of Square Numbers

## Idea

- Start l at zero and r at floor(sqrt(c)). Compare l squared plus r squared with c, increasing l when too small and decreasing r when too large.

## Why It Works

- For fixed r, a sum below c cannot be fixed by reducing r, so l must grow. For fixed l, a sum above c cannot be fixed by increasing l, so r must shrink. These eliminations preserve any possible pair until a match is found or the pointers cross.

## Edge Cases

- c = 0 accepts (0, 0). Perfect squares can use a zero partner.

## Complexity

- O(sqrt(c + 1)) time and O(1) auxiliary space.

## Notes

- Pointer values and squared sums use long so the sum of two candidate squares cannot overflow int.
