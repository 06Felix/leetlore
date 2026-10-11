# Maximum Difference by Remapping a Digit

## Idea
- Maximize by replacing every occurrence of the first non-nine digit with nine.
- Minimize by replacing every occurrence of the leading digit with zero, then parse both results and subtract.

## Why It Works
- Improving the earliest changeable position dominates any change confined to later digits, so the chosen replacement maximizes the number.
- Leading zeros are allowed here, making zero the best replacement for the leading digit; later changes cannot beat that earliest reduction.

## Edge Cases
- An all-nine number uses an unchanged nine-to-nine mapping for its maximum.
- Zero-padded minimum strings parse as their numeric values; the nine-digit maximum possible under the bound fits `int`.

## Complexity
- Time: $O(D)$ for $D$ decimal digits.
- Space: $O(D)$ for strings and mutable copies.
