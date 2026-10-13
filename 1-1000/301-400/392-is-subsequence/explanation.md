## Idea

- Scan both character arrays with two pointers. Advance the source pointer only on a matching target character, and always advance the target pointer.

## Why It Works

- Matching each needed character as early as possible leaves at least as much target suffix as any later choice. Thus greedy matches succeed exactly when a full order-preserving subsequence exists.

## Edge Cases

- An empty source succeeds immediately. A nonempty source cannot match an empty target.

## Complexity

- O(source length+target length) time and space, including both character arrays.

## Notes

- This handles one query; the optional many-query follow-up is not preprocessed.
