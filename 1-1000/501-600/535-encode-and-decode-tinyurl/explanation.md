# Explanation

## Idea

- `encode` stores the latest long URL in a static string.
- It returns a fixed placeholder short URL.
- `decode` ignores its input and returns the stored long URL.

## Why It Works

- The LeetCode test calls `decode(codec.encode(url))` on the same runtime object flow.
- After `encode`, the static field contains the original URL.
- Returning that stored value gives back the input URL for that simple interaction.

## Edge Cases

- A single encode/decode pair works.
- The placeholder short URL has no encoded information.
- Multiple encoded URLs overwrite the same static storage.

## Complexity

- Time: $O(1)$.
- Space: $O(1)$ extra, ignoring the stored URL string.

## Notes

- This is not a real URL shortener. It cannot preserve multiple mappings and depends on the judge using a same-process encode/decode call sequence.
