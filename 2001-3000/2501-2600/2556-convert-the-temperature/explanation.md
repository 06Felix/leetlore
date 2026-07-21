# Convert the Temperature

## Idea

- Return a two-element `double` array.
- Kelvin is `c + 273.15`.
- Fahrenheit is `c * 1.8 + 32`.

## Why It Works

- The formulas are given directly by the problem.
- Both conversions depend only on the input Celsius value.
- Java `double` precision is enough for the accepted tolerance.

## Edge Cases

- `0` Celsius converts to `273.15` Kelvin and `32` Fahrenheit.
- Large allowed Celsius values stay within normal `double` range.
- No rounding is needed because the judge accepts tolerance.

## Complexity

- Time: $O(1)$.
- Space: $O(1)$.
