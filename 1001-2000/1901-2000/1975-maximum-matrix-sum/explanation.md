# Maximum Matrix Sum

## Idea

- Sum absolute values, track the smallest absolute value, and toggle a parity bit for each negative entry. Subtract twice the minimum absolute value only when the negative count is odd.

## Why It Works

- Flipping adjacent pairs preserves sign parity when no entry is zero. On the connected grid, flips along a path can change any chosen pair of endpoint signs, so negatives can be paired away. If one negative must remain, placing it on the smallest magnitude minimizes the loss from the absolute-value sum. A zero absorbs the parity cost.

## Edge Cases

- An even negative count permits the full absolute sum. A zero makes the subtraction zero even when the negative count is odd.

## Complexity

- O(n^2) time and O(1) auxiliary space.

## Notes

- The input is unchanged. The sum uses long, and absolute-value arithmetic is safe under the stated bounds. The formula matched exhaustive adjacent-flip search for 625 small 2-by-2 matrices.
