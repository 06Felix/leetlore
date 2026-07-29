# Check if All Characters Have Equal Number of Occurrences

## Idea

- Count occurrences of each lowercase letter.
- Store `rq` as the final frequency of the last character processed.
- Verify every nonzero frequency equals `rq`.

## Why It Works

- The last character appears in the string, so its final count is a valid target frequency.
- A good string requires every appearing character to have the same frequency as any other appearing character.
- Ignoring zero counts avoids requiring absent characters to match.

## Edge Cases

- A one-character string returns `true`.
- Characters absent from the string do not affect the result.
- If any appearing character differs from the target count, the method returns `false`.

## Complexity

- Time: `O(n + 26)`, where `n` is `s.length()`.
- Space: `O(1)`.
