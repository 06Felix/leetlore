## Idea

- For each candidate index, branch between skipping it and choosing it. Choosing retains the same index for unlimited reuse; stop when the sum exceeds target or equals it.

## Why It Works

- Every combination has one count for each candidate. Skip/take traversal enumerates those counts in fixed index order, avoiding permutation duplicates. Positive candidates ensure over-target branches can never recover and repeated-choice recursion terminates.

## Edge Cases

- Unreachable targets return no combinations. Copying a completed list isolates it from later backtracking.

## Complexity

- Exponential search; a conservative bound is O(2^(n+target/minCandidate)) node work plus copying output. O(n+target/minCandidate) auxiliary stack/list space.

## Notes

- The answer list is retained between public calls, so reusing the same Solution object includes old combinations.
