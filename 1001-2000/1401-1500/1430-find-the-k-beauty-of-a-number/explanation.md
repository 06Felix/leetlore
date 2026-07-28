# Explanation

## Idea

Convert `num` to a string and inspect every substring of length `k`.

Parse each substring as an integer and count it when it is nonzero and divides the original number.

## Why It Works

The k-beauty definition asks for exactly these contiguous length-`k` digit substrings. Sliding the start index from `0` through `s.length() - k` enumerates all of them once.

The divisor check `num % x == 0` matches the required condition, and `x != 0` enforces that zero is not a divisor.

## Edge Cases

- Substrings with leading zeros parse correctly, such as `"04"` to `4`.
- `"00"` is skipped because it parses to zero.
- Repeated equal substrings are counted separately because they occur at different positions.

## Complexity

Time: `O(d * k)`, where `d` is the number of digits.

Space: `O(d)` for the string and substrings.
