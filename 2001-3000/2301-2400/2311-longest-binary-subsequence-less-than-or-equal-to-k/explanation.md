## Idea

Scan from right to left, taking affordable ones at their binary place values. Return their count plus the number of zeros in the entire string.

## Why It Works

Zeros can all be retained, including as leading zeros. For any number of selected ones, using the rightmost available ones minimizes the represented value. The scan takes these cheapest ones while they fit; once the next place value exceeds the remaining budget, every earlier one is at least as expensive.

## Edge Cases

All-zero strings return their full length. Zeros before the stopping point are still included as leading zeros.

## Complexity

O(n) time and O(1) auxiliary space.

## Notes

Under k ≤ 10⁹, the loop stops before its int place-value arithmetic overflows.
