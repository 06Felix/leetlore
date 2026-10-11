# Count Largest Group

## Idea
- Compute the digit sum of every number from one through `n`, accumulating group sizes in a map.
- Track the largest size, then count how many groups have that size.

## Why It Works
- Repeated division and remainder extract every decimal digit exactly once.
- Each integer enters exactly its digit-sum group; comparing all final group counts to the maximum returns the number of largest groups.

## Edge Cases
- Several groups can tie for the maximum; all are counted.
- Powers of ten and internal zeros are handled naturally by digit extraction; zero itself is outside the enumeration.

## Complexity
- Expected time: $O(n\log(n+1))$ for digit extraction and hash-map updates.
- Space: $O(\log(n+1))$ possible digit-sum groups; at most 36 under the stated bounds.
