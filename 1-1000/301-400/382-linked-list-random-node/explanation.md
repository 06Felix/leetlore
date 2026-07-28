# Explanation

## Idea

Use reservoir sampling with reservoir size one. Each `getRandom` call scans the list once.

At the `i`th node, replace the current answer with probability `1 / i`.

## Why It Works

The first node is chosen initially with probability `1`. At each later node `i`, it is selected with probability `1 / i`, while every previous selected value survives with probability `(i - 1) / i`.

After processing all nodes, every node has probability `1 / n` of being the final answer.

## Edge Cases

- A one-node list always returns that node's value.
- Negative node values are valid; `-1` is only the initial placeholder before the first node is sampled.
- No extra storage is needed for list values.

## Complexity

Time: `O(n)` per `getRandom`.

Space: `O(1)`.
