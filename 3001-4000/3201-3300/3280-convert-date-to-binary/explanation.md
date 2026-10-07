# Explanation

## Idea
- Extract the fixed year, month, and day substrings and parse each as an integer.
- Convert each integer with `Integer.toBinaryString` and join the results with hyphens.

## Why It Works
- Fixed substring positions match the guaranteed `yyyy-mm-dd` layout.
- Parsing removes decimal leading zeroes, and binary conversion emits each positive component without leading zeroes while preserving its value.

## Edge Cases
- Month and day values such as `01` become `1`.
- Leap days need no special handling because the input is guaranteed to be a valid date.

## Complexity
- Time: $O(1)$ under the fixed ten-character input and bounded date range.
- Space: $O(1)$ under those bounds, including the output.
