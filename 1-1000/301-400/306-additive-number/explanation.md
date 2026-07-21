# Additive Number

## Idea

- Enumerate the first and second numbers by choosing split positions.
- Skip splits that create leading zeros.
- Recursively check whether the remaining suffix starts with `first + second`.
- Shift the pair forward after each successful sum match.

## Why It Works

- An additive sequence is fully determined by its first two numbers.
- Trying every valid first-two-number split covers every possible sequence.
- Each recursive step verifies the only legal next value.
- Reaching the end after repeated matches proves the whole string is additive.

## Edge Cases

- Leading zero first numbers and second numbers are rejected except for the single digit `"0"`.
- Short strings fail naturally because no valid three-number split can consume the whole string.
- The loop bound ensures enough remaining digits for a next number.

## Complexity

- Time: $O(n^3)$ roughly from split choices and recursive prefix checks.
- Space: $O(n)$ recursion depth.

## Notes

- The implementation parses operands as `long`; it can overflow for very large candidate substrings, which the problem follow-up asks to handle separately.
