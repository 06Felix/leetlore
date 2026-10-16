# Single Number

## Idea

- XOR every array value into an accumulator initialized to zero.

## Why It Works

- XOR is associative and commutative, equal values cancel because x XOR x = 0, and zero is the identity. Every duplicated value disappears, leaving only the single occurrence.

## Edge Cases

- A one-element array returns that element. Zero and negative values obey the same bitwise cancellation rules.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The implementation meets the explicit linear-time and constant-extra-space requirements and leaves nums unchanged.
