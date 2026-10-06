# Explanation

## Idea
- Recursively evaluate an expression interval; a single character directly supplies its boolean value.
- Scan each compound interval while tracking parenthesis depth, splitting operands only at commas in its outermost argument list.
- Evaluate the operand intervals, then combine their results with AND, OR, or NOT according to the outer operator.

## Why It Works
- Depth tracking keeps commas inside nested expressions from splitting the current operand list.
- Recursion reduces every operand to its correct truth value before applying the parent operator.
- The valid-expression guarantee supplies one operand for NOT and at least one for AND or OR.

## Edge Cases
- Literal-only inputs use the base case; single-operand AND and OR work with their usual identity values.
- Nested operators are handled at their own recursion level, and all operands are evaluated even when a result could be short-circuited.

## Complexity
- Time: $O(L^2)$ worst case because deeply nested intervals repeatedly scan overlapping portions of the length-$L$ string.
- Auxiliary space: $O(L)$ for recursion and operand-result lists in the worst case.

## Notes
- Deep nesting near the $2 \cdot 10^4$ character limit can exhaust the Java stack. The implementation is preserved; it does not use an iterative parser or a shared cursor.
