# Max Difference You Can Get From Changing an Integer

## Idea
- Maximize by replacing the first digit other than nine, and all its occurrences, with nine.
- Minimize by replacing a non-one leading digit with one; if the leading digit is already one, replace the first later digit other than zero or one with zero.

## Why It Works
- The earliest changed position determines which equal-length decimal result is larger or smaller.
- The leading digit cannot become zero, so one is its minimum permitted replacement. When it is already one, changing a later digit distinct from zero and one avoids changing that leading digit.
- Replacing all matching occurrences follows the operation's rule, and independent extrema maximize their difference.

## Edge Cases
- If no non-nine digit exists, the maximum remains unchanged.
- If all digits are zero or one, the minimum fallback maps the leading one to itself. Both parsed results remain positive without leading zeros.

## Complexity
- Time: $O(D)$ for digit scans, replacements, and parsing.
- Space: $O(D)$ for copied characters and strings.
