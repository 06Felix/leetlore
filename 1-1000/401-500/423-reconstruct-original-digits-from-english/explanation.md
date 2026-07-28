# Explanation

## Idea

Count letters that identify digits. Some letters appear in only one digit word, such as `z` for zero, `w` for two, `u` for four, `x` for six, and `g` for eight.

The implementation first counts useful letters, then subtracts already-resolved digits to get the ambiguous ones.

## Why It Works

The unique letters determine digits `0`, `2`, `4`, `6`, and `8` directly.

After those are known, letters like `o`, `h`, `f`, `s`, and `i` can be corrected by subtracting the digits that also used them. This leaves exact counts for `1`, `3`, `5`, `7`, and `9`.

Appending each digit by its count from `0` to `9` returns the required ascending order.

## Edge Cases

- Repeated digits are handled by counts.
- The input is guaranteed valid, so adjusted counts do not become invalid.
- Large strings are processed in one pass plus fixed digit loops.

## Complexity

Time: `O(|s| + output length)`.

Space: `O(1)`.
