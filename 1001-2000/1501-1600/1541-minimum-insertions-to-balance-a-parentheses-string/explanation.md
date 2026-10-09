# 1541. Minimum Insertions to Balance a Parentheses String

## Idea

- In this problem, one `'('` must be closed by two consecutive `')'`.
- Keep `need` as the number of `')'` characters still required.
- `ans` counts the characters we insert while scanning the string.

## How the Code Works

- When we see `'('`, it creates a need for two closing parentheses, so `need += 2`.
- If `need` becomes odd, the previous open bracket was waiting for only one more `')'`. Before starting a new group, we insert that missing `')'`.
- When we see `')'`, it satisfies one required closing parenthesis, so `--need`.
- If `need` becomes negative, this `')'` has no matching `'('`; we insert one `'('` before it, and this current `')'` becomes the first half of its closing pair.

## Why It Works

- The scan always fixes the earliest imbalance as soon as it is forced.
- An odd `need` means a pair of closing parentheses has been split, so inserting one `')'` is unavoidable before a new `'('`.
- A negative `need` means a closing parenthesis appeared before any valid opener, so inserting `'('` is also unavoidable.
- After the scan, any remaining `need` characters must be appended to finish the open groups.

## Edge Cases

- Already balanced strings add nothing extra.
- Strings starting with `')'` are handled by inserting a missing `'('`.
- Strings ending with unmatched `'('` are handled by adding the remaining `need`.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Tags

- String
- Greedy
- Stack
