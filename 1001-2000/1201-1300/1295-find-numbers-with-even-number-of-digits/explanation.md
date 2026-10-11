# Find Numbers with Even Number of Digits

## Idea
- Count values in the two-digit range, the four-digit range, or equal to 100,000.
- Use direct comparisons instead of converting values to strings or repeatedly dividing.

## Why It Works
- Within the stated range, even digit counts can only be two, four, or six.
- The tested intervals exactly cover two and four digits; 100,000 is the only allowed six-digit value.

## Edge Cases
- Boundary values 10, 99, 1000, and 9999 qualify; adjacent odd-length values do not.
- The method relies on positive values no larger than 100,000.

## Complexity
- Time: $O(n)$ for one scan.
- Space: $O(1)$ auxiliary storage.
