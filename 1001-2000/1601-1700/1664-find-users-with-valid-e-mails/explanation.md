# Find Users With Valid E-Mails

## Idea

- Filter rows with a regular expression on `mail`.
- The regex requires the prefix to start with a letter.
- It then allows letters, digits, underscore, period, or dash before the exact `@leetcode.com` domain.
- The extra `NOT LIKE '%?%'` condition excludes question marks.

## Why It Works

- `^` and `$` force the entire email to match, not just a substring.
- `[a-zA-Z]` enforces the first-prefix-character rule.
- `[a-zA-Z0-9_\\.\\-]*` matches the allowed remaining prefix characters.
- `@leetcode\\.com` enforces the required lowercase domain.

## Edge Cases

- Prefixes starting with `.` or `_` fail because the first character must be a letter.
- Emails with other domains fail because the domain is anchored.
- Invalid symbols such as `#` or `?` fail the allowed-character check.

## Complexity

- Time: $O(n \cdot L)$ for `n` emails of length `L`.
- Space: $O(1)$ besides returned rows.

## Notes

- The `NOT LIKE '%?%'` check is redundant because the regex already excludes `?`.
