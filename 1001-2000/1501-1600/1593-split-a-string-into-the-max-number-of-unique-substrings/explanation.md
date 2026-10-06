# Explanation

## Idea
- At each unprocessed position, try every nonempty substring ending later in the string.
- Use a set to reject pieces already chosen in the current partition; add a candidate before recursion and remove it afterward.
- When the entire string is consumed, update the largest set size found.

## Why It Works
- Trying every endpoint explores every possible partition in order without skipping characters.
- The set guarantees that all pieces in a completed partition are distinct.
- Backtracking restores the choices for neighboring branches, so taking the best completed partition gives the maximum valid count.

## Edge Cases
- A single character yields one piece; repeated characters may require grouping into longer pieces.
- Different substring occurrences with equal contents are correctly considered duplicates by the set.

## Complexity
- Time: $O(n \cdot 2^n)$ as an upper bound, including substring copying and hashing across the partition search.
- Auxiliary space: $O(n)$ for recursion and the current partition's stored substring contents.

## Notes
- The `ans` field is not reset at method entry. Reusing the same `Solution` instance can retain a larger result from a previous input; the code assumes one call per instance.
