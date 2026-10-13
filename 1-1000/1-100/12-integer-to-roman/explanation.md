## Idea

- Try Roman tokens in descending value order, including all six subtractive pairs. Append each token while subtracting its value from the remaining number.

## Why It Works

- The ordered tokens implement the decimal-place Roman construction: thousands, hundreds, tens, then units. Explicit four/nine tokens encode each permitted subtraction and avoid illegal repeated symbols. Repeated subtraction accounts for the full original value.

## Edge Cases

- Values one through three repeat I; values four and nine use IV and IX. The range ends at 3999.

## Complexity

- O(1) time and space under the fixed 1..3999 range, including the bounded output; equivalently O(output length) token-writing work.
