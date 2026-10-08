# Explanation

## Idea
- Allocate a complete copy of the linked list.
- Reverse the copied list iteratively, then compare its values with the original list from their respective heads.

## Why It Works
- The reversed copy has the original values in opposite order.
- Equality at every position is exactly the palindrome condition. Copying ensures the original links are not altered by reversal.

## Edge Cases
- A singleton is a palindrome.
- The first unequal pair returns false; both odd and even lengths use the same comparison.

## Complexity
- Time: $O(n)$ for copying, reversal, and comparison.
- Auxiliary space: $O(n)$ for the copied nodes.

## Notes
- This implementation satisfies the main problem but does not meet the optional $O(1)$-space follow-up.
- It assumes a nonempty list, as guaranteed by the statement.
