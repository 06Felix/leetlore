## Idea

- Compute the doubling depth with ceil(log₂ k). Walk operations backward; whenever k lies in the appended half, subtract that half length and accumulate the operation’s character shift.

## Why It Works

- Both halves correspond to the same earlier positions. The second half adds a shift exactly when its operation is type one. Repeatedly mapping back reaches the initial a; reducing the accumulated shift modulo 26 handles wrapping.

## Edge Cases

- k = 1 requires no shifts. Type-zero operations change position mapping but not the character.

## Complexity

- O(log k) time and O(1) space.

## Notes

- The depth is computed using floating-point logarithms. Rounding near powers of two can overestimate the needed depth and may access an operation beyond the supplied array when its length is exactly the true depth. The backward-mapping argument assumes the computed depth is correct; the stored solution is unchanged.
