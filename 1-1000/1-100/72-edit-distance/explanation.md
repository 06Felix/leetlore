## Idea

- DP over both prefix lengths. Matching final characters reuse the diagonal cost; a mismatch takes one plus the cheapest replacement, deletion, or insertion predecessor.

## Why It Works

- Every conversion either preserves equal trailing characters or ends with one of the three permitted operations. These operations reduce to the corresponding smaller prefix problems, so minimizing them gives the optimal edit count.

## Edge Cases

- Converting an empty prefix requires only insertions or deletions. Both empty words have distance zero.

## Complexity

- O((m+1)(n+1)) time and space.
