# Convert a Number to Hexadecimal

## Idea

- The solution extracts the lowest 4 bits of `num` with `num & 0xf`.
- That value indexes into the hexadecimal digit array.
- It appends digits from least significant to most significant.
- `num >>>= 4` shifts right without sign extension, which handles negative numbers as 32-bit two's complement.

## Why It Works

- One hexadecimal digit represents exactly 4 bits.
- Repeatedly taking the low 4 bits enumerates all hex digits of the 32-bit value.
- Unsigned right shift eventually turns negative numbers into zero after eight hex digits.
- Reversing the accumulated digits gives the standard most-significant-first representation.

## Edge Cases

- `num = 0` produces no loop iterations and returns `"0"`.
- Negative inputs use two's complement through unsigned shifting.
- Leading zeros are naturally omitted because the loop stops when the shifted value becomes zero.

## Complexity

- Time: $O(1)$ because an `int` has at most 8 hex digits.
- Space: $O(1)$.
