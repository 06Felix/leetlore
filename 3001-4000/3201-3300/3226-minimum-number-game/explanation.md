# Explanation

## Idea

Use a min-heap to simulate the game. Each round removes the two smallest numbers: Alice's pick first, then Bob's pick.

The output appends Bob's number first, then Alice's number.

## Why It Works

The game always chooses the current minimum twice per round. A priority queue gives those two values in the required order.

After polling `a` for Alice, the next poll is Bob's number. The implementation writes Bob's value first and then `a`, matching the append rule.

## Edge Cases

- The input length is even, so each round has two numbers.
- Duplicate values are handled naturally by the heap.
- The smallest pair is swapped in the output for every round.

## Complexity

Time: `O(n log n)`.

Space: `O(n)`.
