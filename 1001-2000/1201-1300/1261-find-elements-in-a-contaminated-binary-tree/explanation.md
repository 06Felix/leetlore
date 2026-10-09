## Idea
- DFS through the existing shape, carrying the root value zero and deriving child values as 2x + 1 and 2x + 2.
- Store every derived value in a set; answer find with set membership.

## Why It Works
- The carried root value is correct, and each recursive child calculation applies the recovery rule exactly.
- Each existing node contributes its recovered value, so set membership matches whether a target occurs in the recovered tree.

## Edge Cases
- A root-only tree contains zero and no other target.
- Missing children contribute no values; height at most twenty keeps derived values safely within int.

## Complexity
- O(n) expected constructor time and O(1) expected time per find.
- O(n) set storage plus O(h) recursion, where h <= 20.

## Notes
- The implementation recovers values only in the set. It leaves every TreeNode.val contaminated, so it does not literally recover the supplied tree as requested by the constructor description, although find results are correct.
