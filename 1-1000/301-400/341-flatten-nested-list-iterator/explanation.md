# Flatten Nested List Iterator

## Idea

- Eagerly traverse the nested list during construction.
- Whenever an integer is found, append it to a queue.
- For a nested list, recursively flatten its contents in order.
- `next()` polls from the queue, and `hasNext()` checks whether the queue is non-empty.

## Why It Works

- The recursive traversal visits nested elements in the same left-to-right order required by the iterator.
- Storing integers in a queue preserves that traversal order.
- Once construction finishes, iteration is just consuming the already flattened sequence.

## Edge Cases

- Deeply nested lists are handled recursively.
- Empty nested sublists add nothing to the queue.
- Calling `hasNext()` repeatedly does not advance the iterator.

## Complexity

- Construction time: `O(n)`, where `n` is the total number of nested elements.
- `next()` and `hasNext()` time: `O(1)`.
- Space: `O(v)`, where `v` is the number of integer values stored in the queue.
