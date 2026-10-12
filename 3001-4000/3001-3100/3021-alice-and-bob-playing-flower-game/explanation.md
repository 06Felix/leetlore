## Idea

- Count odd and even numbers in each range. Return oddFirst·evenSecond + evenFirst·oddSecond.

## Why It Works

- Exactly x+y flowers are removed before the game ends. Alice moves first and wins precisely when this total is odd, which occurs exactly for opposite-parity pairs.

## Edge Cases

- If both ranges contain only one, there are no winning pairs. Long products hold answers beyond int range.

## Complexity

- O(1) time and auxiliary space.
