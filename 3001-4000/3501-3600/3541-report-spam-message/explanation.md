# Report Spam Message

## Idea

- Put all banned words in a hash set.
- Scan the message words and count how many appear in the banned set.
- Return `true` as soon as two banned words are found.

## Why It Works

- Hash set membership checks whether a message word exactly matches a banned word.
- The problem only needs to know whether at least two message words match, so early return at count `2` is sufficient.
- If the scan finishes with fewer than two matches, the message is not spam.

## Edge Cases

- Repeated banned words in the message count as separate matching message words.
- If only one word matches, the method returns `false`.
- Large inputs are handled with linear scans and constant-average-time set lookups.

## Complexity

- Time: `O(b + m)`, where `b` is `bannedWords.length` and `m` is `message.length`.
- Space: `O(b)` for the banned-word set.
