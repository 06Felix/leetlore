# Explanation

## Idea

Instead of building the full converted string, immediately sum the digits of each letter's alphabet position.

That performs the first transform. Then repeat digit-sum transforms on the integer result for the remaining `k - 1` rounds.

## Why It Works

The first operation converts letters to numbers and then sums all digits. Summing each letter value's digits independently gives the same total as concatenating all values and summing the resulting digits.

After that, the value is an integer, so each remaining transform is just a normal digit sum.

## Edge Cases

- `k = 1` returns the first digit-sum total.
- The loop stops early when the answer is already one digit.
- Letters from `j` to `z` contribute two-digit alphabet positions.

## Complexity

Time: `O(|s| + k log A)`, where `A` is the intermediate answer.

Space: `O(1)`.
