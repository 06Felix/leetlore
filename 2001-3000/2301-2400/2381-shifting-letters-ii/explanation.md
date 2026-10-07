# Explanation

## Idea
- Encode each forward or backward range shift in a difference array: add its sign at `start` and subtract it at `end + 1`.
- Accumulate the active shift modulo 26 and apply it to each original character to build the result.

## Why It Works
- Prefix sums of the difference array count exactly the net signed shifts covering each position.
- Alphabet shifts add and commute; reducing their sum modulo 26 preserves the final letter.
- Adding 26 before the final remainder converts a negative Java remainder into the proper nonnegative letter offset.

## Edge Cases
- Backward shifting `a` wraps to `z`, and forward shifting `z` wraps to `a`.
- Opposing overlapping shifts cancel; the extra difference-array slot handles a range ending at the last character.

## Complexity
- Time: $O(n + q)$ for string length `n` and `q` shifts.
- Space: $O(n)$ for the difference array and constructed output.
