# Explanation

## Idea

Reduce `k` by the total chalk used in one full round. Then scan students once and subtract each student's chalk usage.

The first student that makes the remaining chalk negative must replace it.

## Why It Works

Full rounds repeat identically, so only `k % totalChalk` matters.

After the modulo, scanning from the beginning simulates the partial round where chalk runs out. The replacement happens exactly when the current remaining amount is less than the next student's need.

## Edge Cases

- If the remainder is `0`, student `0` replaces the chalk on the next turn.
- The total is computed as `long` through the stream to avoid overflow.
- The final fallback return is unreachable for valid inputs.

## Complexity

Time: `O(n)`.

Space: `O(1)`.
