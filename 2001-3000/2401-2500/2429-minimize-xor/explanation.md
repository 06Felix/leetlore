# Explanation

## Idea
- Determine the required number of set bits from `num2`; return `num1` directly when its bit count already matches.
- Copy set bits of `num1` into the answer from highest to lowest until the quota is met.
- If more bits are needed, add bits where `num1` has zeroes, starting from the lowest position.

## Why It Works
- Matching a high set bit avoids a larger XOR penalty than any combination of lower-bit changes, so those matches take priority.
- Once all original set bits are retained, any extra set bit adds an XOR penalty. Choosing the lowest zero positions minimizes that extra value.

## Edge Cases
- Equal bit counts yield XOR zero by returning `num1`.
- Fewer required bits retain only the highest original set bits; more required bits retain all of them and fill low zero positions.

## Complexity
- Time: $O(30)$, constant for the stated integer bounds.
- Auxiliary space: $O(1)$.

## Notes
- Values at most $10^9$ occupy bits zero through 29, so the fixed scan covers every necessary position.
