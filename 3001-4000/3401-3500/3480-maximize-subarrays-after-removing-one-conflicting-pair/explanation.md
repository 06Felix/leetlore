## Idea

- Count valid prefixes while tracking the best gain from deleting one conflicting pair.

## Why It Works

- Each conflict invalidates a suffix of starting positions; removing one pair removes its contribution, and the maximum gain is accumulated while scanning endpoints.

## Edge Cases

- The no-removal count is included; duplicate conflicts are handled independently.

## Complexity

- O(n+m) time and O(n+m) space.
