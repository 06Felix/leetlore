# Explanation

## Idea

Split logs into letter-logs and digit-logs. Letter-logs are stored as `[identifier, content]`; digit-logs are kept unchanged in their original order.

Sort letter-logs by content first, then by identifier, and append digit-logs afterward.

## Why It Works

The first character after the identifier determines whether a log is digit-based or letter-based.

The comparator implements the required ordering for letter-logs. Digit-logs are never sorted, so their relative order is preserved.

Joining identifier and content reconstructs each sorted letter-log.

## Edge Cases

- Equal letter contents fall back to identifier order.
- Digit logs before letter logs in the input are moved after all letter logs.
- Single-space token separation lets `indexOf(' ')` split identifier from content.

## Complexity

Time: `O(L log L * W + D)`, where `L` is the number of letter-logs and `W` is max compared log length.

Space: `O(n * W)`.
