# Explanation

## Idea

- Strip leading and trailing whitespace, then read an optional sign.
- Consume consecutive decimal digits and build the value in a `long`.
- Clamp as soon as the signed value reaches an `int` boundary; stop at the first non-digit.

## Why It Works

- The sign is separated before digit accumulation, so every accepted digit updates the value with the correct sign.
- Processing digits left to right applies decimal place value: `num = num * 10 + digit`.
- The early bounds checks return the required saturated value before an `int` cast can overflow.

## Edge Cases

- Empty or whitespace-only input returns `0`.
- A sign without following digits returns `0`.
- Parsing stops at the first non-digit after the optional sign.

## Complexity

- Time: `O(n)`, where `n` is the input length.
- Space: `O(n)` because `strip()` and `substring()` may create strings.

## Notes

- The implementation uses `String.strip()` and `Character.isDigit()`, so its accepted whitespace and digit behavior follows Java's Unicode-aware APIs rather than only ASCII characters.
