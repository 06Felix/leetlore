# Explanation

## Idea

- Treat each character as a digit and multiply every digit pair.
- Accumulate each product into `pos[i + j]` and `pos[i + j + 1]`, which are the two decimal positions affected by the pair.
- Read the normalized digit array from left to right, skipping leading zeroes.

## Why It Works

- A digit at index `i` multiplied by a digit at index `j` contributes to decimal positions `i + j` and `i + j + 1` from the right.
- The quotient becomes the carry for the higher position, while the remainder stays in the current position.
- After all pairs are processed, `pos` contains the same base-10 digits as the product.

## Edge Cases

- If every accumulated digit is zero, return the string `"0"` rather than an empty string.
- The output array has length `m + n`, enough for the maximum product size.

## Complexity

- Time: `O(mn)`.
- Space: `O(m + n)`.
