# Explanation

## Idea

Scan left to right and greedily feed each hamster. If it is already fed by a bucket on the left, skip it. Otherwise, prefer placing a bucket on the right; if that is impossible, try the left.

Buckets are marked directly in a character array as `'B'`.

## Why It Works

Placing a bucket to the right of the current hamster is always at least as good as placing it to the left, because it may also feed the next hamster.

If a left bucket already exists, adding another bucket is unnecessary. If neither adjacent cell can hold a bucket, that hamster cannot be fed in any valid arrangement.

## Edge Cases

- Hamsters at the ends only have one possible adjacent bucket position.
- Consecutive hamsters with no empty adjacent cell return `-1`.
- The final answer is the number of `'B'` marks placed.

## Complexity

Time: `O(n)`.

Space: `O(n)` for the character array.
