# Sum of All Subset XOR Totals

## Idea
- OR all input values to find every bit that appears anywhere.
- Multiply that OR value by $2^{n-1}$ using a left shift by `n - 1`.

## Why It Works
- For any bit appearing in at least one element, toggling that element's membership pairs subsets with opposite XOR parity for the bit.
- Exactly half of the $2^n$ subsets therefore contribute each present bit. Absent bits contribute nothing, giving $(nums[0]\,|\,\cdots\,|\,nums[n-1])2^{n-1}$.

## Edge Cases
- A one-element array shifts by zero and returns that element; repeated values still represent distinct subset membership choices.
- The empty subset contributes zero. The maximum result fits `int` under the given length and value limits.

## Complexity
- Time: $O(n)$ for the OR scan.
- Space: $O(1)$ auxiliary storage.
