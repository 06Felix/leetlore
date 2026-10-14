## Idea

- Delegate the exponentiation to Math.pow(x,n).

## Why It Works

- The library operation evaluates the requested base raised to the integer exponent, including reciprocals for negative exponents, and returns the double result.

## Edge Cases

- Zero exponent returns one. The constraints exclude zero with nonpositive exponent. Integer.MIN_VALUE needs no manual negation.

## Complexity

- Fixed-width library call; its internal algorithm is runtime-dependent. No explicit auxiliary allocation in this wrapper.

## Notes

- This solution relies on the library’s floating-point behavior rather than implementing binary exponentiation.
