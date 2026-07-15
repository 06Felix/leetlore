# Explanation

## Idea

- Collapse consecutive `*` characters in the pattern.
- Delegate matching to Java's regular-expression engine with `Pattern.matches`.
- Since `Pattern.matches` requires the entire input to match, the result directly answers the problem.

## Why It Works

- Java regex supports `.` as any single character and `*` as repetition of the preceding element, matching the problem's two pattern operators.
- `Pattern.matches` anchors the match to the full string rather than accepting a matching substring.
- Under the problem's valid-pattern constraints, the engine's boolean result is the required answer.

## Edge Cases

- Empty strings and patterns are handled by the regex engine.
- Consecutive stars are normalized before matching.
- Invalid regex exceptions are converted to `false`, although valid input constraints should prevent them.

## Complexity

- Time: Depends on Java's regex engine and pattern; it is not bounded here by a simple polynomial expression.
- Space: Depends on the regex engine's internal matching state.

## Notes

- This is concise and works for the supported syntax, but it delegates the core problem to a library regex engine. A restriction-compliant dynamic-programming or backtracking solution would make the complexity and wildcard semantics explicit.
