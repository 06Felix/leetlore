# Most Profit Assigning Work

## Idea

- Pair each job as `(difficulty, profit)`.
- Sort jobs by difficulty and workers by ability.
- Sweep workers from weakest to strongest while advancing through all jobs they can do.
- Track `maxProfit`, the best profit among jobs seen so far, and add it for each worker.

## Why It Works

- Once workers are sorted, a later worker can do every job an earlier worker could do, possibly more.
- Advancing the job pointer only forward visits each affordable job once.
- `maxProfit` stores the best available job for the current worker ability.
- Jobs may be reused, so adding the same best profit for multiple workers is allowed.

## Edge Cases

- Workers unable to do any job add `0`.
- Difficulty order does not need profit order because `maxProfit` handles the best seen profit.
- Duplicate difficulties are processed independently and the largest profit survives.

## Complexity

- Time: $O(n \log n + m \log m)$ for jobs and workers.
- Space: $O(n)$ for the job pairs.

## Notes

- The submitted code uses `Pair<Integer, Integer>`, which depends on that helper type being available in the judge environment.
