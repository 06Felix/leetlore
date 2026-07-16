# Evaluate the Bracket Pairs of a String

## Idea

- The solution first stores every knowledge pair in a hash map.
- It scans the string and appends normal characters directly.
- When it sees `'('`, it finds the matching `')'`, extracts the key, and appends the mapped value.
- Missing keys are replaced with `"?"`.

## Why It Works

- The problem guarantees no nested brackets, so `indexOf(')', i)` finds the closing bracket for the current key.
- The map gives constant-time lookup for each key.
- Setting `i = j` skips the whole bracket pair after it has been evaluated.
- All non-bracket characters are preserved in order.

## Edge Cases

- Empty knowledge leaves every bracketed key as `"?"`.
- Repeated keys in `s` reuse the same map value.
- Adjacent bracket pairs are processed one after another without extra separators.

## Complexity

- Time: $O(n + k)$ for string length `n` and knowledge size `k`, aside from substring construction.
- Space: $O(k + n)$ for the map and output builder.
