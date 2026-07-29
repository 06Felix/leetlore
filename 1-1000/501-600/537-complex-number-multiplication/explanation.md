# Complex Number Multiplication

## Idea

- Parse each complex number into real and imaginary integer parts.
- Use the formula `(a + bi)(c + di) = (ac - bd) + (ad + bc)i`.
- Format the computed real and imaginary parts back as `"real+imaginaryi"`.

## Why It Works

- The helper splits around `'+'` and removes the trailing `'i'`, matching the guaranteed input format.
- Multiplication follows directly from `i^2 = -1`.
- The returned string uses the same representation required by the problem, including negative imaginary values like `0+-2i`.

## Edge Cases

- Negative imaginary parts are parsed correctly because they appear after the plus sign, such as `"1+-1i"`.
- Zero real or imaginary results are formatted normally.
- Input validity is guaranteed, so the parser does not need fallback handling.

## Complexity

- Time: `O(1)` for bounded-length numeric strings.
- Space: `O(1)`.
