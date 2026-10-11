# Count Symmetric Integers

## Idea
- Check every integer in the inclusive range using direct digit arithmetic.
- For two digits, compare the digits; for four digits, compare the sums of the two-digit halves.

## Why It Works
- Under the bound of 10,000, only two-digit and four-digit numbers can qualify.
- Division and remainder extract exactly the digits in each half, so equality matches the definition.

## Edge Cases
- Odd-length numbers and 10,000 are rejected; two-digit repeated digits qualify.
- The four-digit branch starts at 1001. Excluding 1000 is harmless because its half sums are 1 and 0.

## Complexity
- Time: $O(high-low+1)$ with constant work per integer.
- Space: $O(1)$ auxiliary storage.
