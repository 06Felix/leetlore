# Online Stock Span

## Idea

- Maintain a stack of (price, span) pairs with decreasing prices. Pop all prices at most today’s price, adding their spans to today’s initial span of one, then push the combined pair.

## Why It Works

- Each popped entry represents a contiguous block whose prices are all at most its recorded maximum, which is at most today’s price. Merging those blocks stops at the first greater price, exactly the required span boundary.

## Edge Cases

- Equal prices merge because the comparison is <=. A new record high may absorb the entire stack.

## Complexity

- Amortized O(1) per next, O(q) worst-case for one call, and O(q) storage over q calls. Every pair is pushed and popped at most once.

## Notes

- The implementation uses the judge-provided Pair type and compresses historical blocks rather than storing every day separately.
