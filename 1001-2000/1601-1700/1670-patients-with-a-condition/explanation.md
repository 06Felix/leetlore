# Patients With a Condition

## Idea

- Return rows whose `conditions` string contains a condition token starting with `DIAB1`.
- `conditions LIKE "DIAB1%"` matches when the first token starts with that prefix.
- `conditions LIKE "% DIAB1%"` matches when a later token starts after a space.

## Why It Works

- Conditions are space-separated, so a valid matching token either begins the string or follows a space.
- The `DIAB1%` suffix allows any characters after the required prefix inside that token.
- Codes such as `ACNE` or `DIAB201` are ignored because they do not have `DIAB1` at a token start.

## Edge Cases

- Empty condition strings match neither pattern.
- A patient with multiple conditions is found if any token begins with `DIAB1`.
- A substring inside another token is not enough unless it is at the beginning or after a space.

## Complexity

- Time: $O(n \cdot L)$ over `n` rows and condition-string length `L`.
- Space: $O(1)$ besides the returned rows.
