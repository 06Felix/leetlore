# Maximum Number of Eaten Apples

## Idea

- Keep batches in a min-heap by first rotten day. Each day remove expired batches, insert that day’s apples, then eat one from the earliest-expiring batch and reinsert its remainder. Continue after growth ends while batches remain.

## Why It Works

- Eating an earliest-expiring apple cannot worsen an optimal schedule: swapping it with an apple expiring later preserves the later apple’s availability. Repeating this exchange argument makes the greedy daily choice optimal.

## Edge Cases

- A batch expiring on the current day is already unusable. Empty growth days are skipped, and valid stored apples can be eaten after day n - 1.

## Complexity

- O((n + D) log(n + 1)) time and O(n) auxiliary space, where D is the maximum shelf life. The day loop ends by the final expiration, and at most n batches are stored.

## Notes

- The implementation consumes batches one apple at a time rather than batching post-growth days. Input arrays are unchanged; expiration arithmetic is safe under the bounds.
