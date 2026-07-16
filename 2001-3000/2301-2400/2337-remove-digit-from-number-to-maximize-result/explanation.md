# Remove Digit From Number to Maximize Result

## Idea

- The solution scans from left to right for an occurrence of `digit` followed by a larger digit.
- Removing that occurrence makes the next larger digit shift left, improving the number as early as possible.
- If no such occurrence exists, it removes the last occurrence of `digit`.
- `StringBuilder.deleteCharAt` constructs the resulting string.

## Why It Works

- For numbers of equal length, the earliest differing digit determines which result is larger.
- Removing a digit before a larger following digit increases the earliest possible position.
- The first such opportunity is optimal because it improves the most significant position available.
- If every following digit is less than or equal, removing the last occurrence preserves the larger prefix.

## Edge Cases

- If `digit` appears once, that occurrence is removed.
- Equal adjacent occurrences fall through to the later removal rule.
- The input guarantees `digit` appears at least once, so `lastIndexOf` is valid.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the result builder.
