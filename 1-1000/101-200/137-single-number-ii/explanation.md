# Single Number II

## Idea

- Maintain bitmasks ones and twos for bits seen once or twice modulo three. Update ones with XOR and exclusion of twos, then update twos using the newly updated ones.

## Why It Works

- Each bit independently cycles through states 00, 01, 10, and back to 00 as set bits arrive. Values appearing three times leave no state behind; the single value’s bits remain in ones.

## Edge Cases

- Negative values are handled through their full two’s-complement bit patterns. A one-element array returns that value.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The update order is essential: twos uses the new ones. The implementation meets the explicit linear-time and constant-space restrictions.
