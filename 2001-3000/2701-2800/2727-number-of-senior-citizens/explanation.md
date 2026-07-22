# Explanation

Problem: [Number of Senior Citizens](https://leetcode.com/problems/number-of-senior-citizens/)

## Idea

- Each detail string has fixed positions.
- Extract characters at indices `11` and `12`, which encode the age.
- Parse that substring as an integer.
- Count passengers whose age is strictly greater than `60`.

## Why It Works

- The problem defines the compressed format, with age stored immediately after the gender character.
- `substring(11, 13)` extracts exactly those two age digits.
- Parsing gives the numeric age, so `> 60` matches the senior condition.
- Counting every detail string with that condition gives the requested total.

## Edge Cases

- Age `60` is not counted because the condition is strictly greater.
- Leading-zero ages parse correctly as integers.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.

## Notes

- The fixed indices rely on every detail string having length `15`, guaranteed by the constraints.
