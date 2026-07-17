# Construct the Rectangle

## Idea

- The solution starts from `floor(sqrt(area))` as the candidate width.
- It moves the width downward until it divides `area`.
- The length is then `area / width`.
- Starting near the square root minimizes the length-width difference.

## Why It Works

- For a fixed area, factor pairs closest to the square root have the smallest difference.
- The width must be no larger than the length, so the best width is the largest factor not exceeding `sqrt(area)`.
- Once that width is found, `area / width` is the matching length.

## Edge Cases

- Perfect squares return equal length and width.
- Prime areas eventually choose width `1`.
- The area constraints make the downward scan acceptable.

## Complexity

- Time: $O(\sqrt{\text{area}})$ in the worst case.
- Space: $O(1)$.
