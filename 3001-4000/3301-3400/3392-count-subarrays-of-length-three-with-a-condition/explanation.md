# Count Subarrays of Length Three With a Condition

## Idea
- Slide indices `l` and `r`, initially zero and two, across all consecutive three-element windows.
- Compare twice the sum of the endpoints with the middle value, avoiding fractional division.

## Why It Works
- The endpoint difference remains two, so each iteration examines exactly one length-three subarray.
- Java evaluates operands left to right: `l++` uses the old left index, and `r++ - 1` uses the old right index minus one for the middle before advancing `r`.
- Multiplying by two tests exact half equality even for odd or negative middle values.

## Edge Cases
- The final window is included when its right index is `n - 1`.
- Negative values are supported, and doubled endpoint sums fit `int` under the stated limits.

## Complexity
- Time: $O(n)$, examining each window once.
- Space: $O(1)$ auxiliary storage.
