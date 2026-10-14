## Idea

- While right exceeds left, clear right’s least significant set bit. Return the resulting value AND left.

## Why It Works

- Bits below the endpoints’ common high-order prefix vary somewhere across the interval and disappear from its AND. Clearing successive low set bits in right eliminates those varying suffix contributions until the prefix remains; AND with left preserves only the common bits.

## Edge Cases

- A singleton range returns its value. If left is zero, every set bit in right is eventually cleared.

## Complexity

- O(31) fixed-width time and O(1) space.

## Notes

- Java parses right & right−1 as right & (right−1), which is the intended low-bit-clearing expression.
