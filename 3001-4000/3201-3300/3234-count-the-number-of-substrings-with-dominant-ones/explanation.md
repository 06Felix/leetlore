# Count the Number of Substrings With Dominant Ones

## Idea

- Enumerate each possible exact zero count z with z + z^2 <= n. Use a sliding window that discards excess leading zeroes or removable leading ones. Track the last discarded zero prv; a valid ending contributes l - prv starts.

## Why It Works

- With z zeroes, dominance requires at least z^2 ones. The scan keeps the shortest valid suffix when possible. Any start from prv + 1 through l retains exactly those z zeroes and enough ones; earlier starts include an extra zero, and later starts cannot remain valid. Each substring is counted under its unique zero count and ending index.

## Edge Cases

- z = 0 counts all-one substrings. Strings with no qualifying suffix contribute nothing at that ending. The enumeration bound excludes zero counts that cannot fit even the shortest dominant substring.

## Complexity

- O(n sqrt(n)) time and O(n) auxiliary space for toCharArray(); each window scan moves both pointers only forward.

## Notes

- The total is at most n(n + 1)/2 and fits int for n <= 40000. The window logic matched brute force on all 2,046 binary strings of lengths one through ten.
