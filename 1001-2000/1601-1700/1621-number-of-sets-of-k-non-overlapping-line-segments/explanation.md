# Number of Sets of K Non-Overlapping Line Segments

## Idea

We build the answer from left to right.

Let `dp[i][cnt]` mean:

`number of ways to draw cnt segments using only points 0...i`.

For every point `i`, there are two choices:

- Do not end a segment at `i`.
- End the last segment at `i`.

If we end a segment at `i`, its starting point can be any earlier point `p`.
The segment is `[p, i]`, so `p < i`.

The important detail is that segments are allowed to share endpoints. So after
choosing `[p, i]`, the previous segments are still allowed to use point `p`.
That gives `dp[p][cnt - 1]` ways before the last segment.

Instead of summing all possible `p` again and again, we keep that sum while
moving `i` from left to right.

## Why It Works

For `dp[i][cnt]`:

- If point `i` is not used as the end of a new segment, we already know the
  answer from `dp[i - 1][cnt]`.
- If point `i` is the end of the last segment, then the segment must start at
  some point `p < i`.
- For each such `p`, the previous `cnt - 1` segments can be placed among
  points `0...p`, because sharing endpoint `p` is valid.

So the transition becomes:

`dp[i][cnt] = dp[i - 1][cnt] + sum(dp[p][cnt - 1]) for all p < i`

The running `sum` stores that second part, which makes the transition fast.

## Edge Cases

- Drawing `0` segments has exactly one way: choose nothing.
- If there are too few points to draw the requested number of segments, the DP
  naturally stays `0`.
- Shared endpoints are handled by using `dp[p][cnt - 1]`, not `dp[p - 1][cnt - 1]`.

## Complexity

- Time: `O(n * k)`
- Space: `O(n * k)`

## Tags

- Dynamic Programming
- Prefix Sum
- Combinatorics
