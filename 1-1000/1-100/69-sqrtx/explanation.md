## Idea

- Call Math.sqrt(x) and cast the nonnegative result to int.

## Why It Works

- The mathematical square root is nonnegative, so truncation produces its floor. For the stated int domain, double precision distinguishes non-square roots from the neighboring integer sufficiently for this cast.

## Edge Cases

- Zero returns zero; perfect squares return their exact integer root.

## Complexity

- O(1) fixed-width time and space.

## Notes

- The implementation delegates to a built-in root function. It does not demonstrate the manual root computation intended by the no-built-in-exponent exercise; if that prohibition includes built-in square-root routines, Math.sqrt does not satisfy it.
