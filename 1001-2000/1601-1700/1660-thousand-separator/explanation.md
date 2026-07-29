# Thousand Separator

## Idea

- Convert the number to a string.
- Scan left to right and append each digit to a `StringBuilder`.
- Before appending a digit, insert `.` when the number of remaining digits is a multiple of three and this is not the first digit.

## Why It Works

- Thousands separators split digits into groups of three from the right.
- `(str.length() - i) % 3 == 0` identifies positions just before such a group starts.
- Skipping `i = 0` prevents a leading separator.

## Edge Cases

- Numbers with three or fewer digits get no separator.
- `0` becomes `"0"`.
- Larger values receive multiple separators at the correct group boundaries.

## Complexity

- Time: `O(d)`, where `d` is the number of digits.
- Space: `O(d)` for the output builder.
