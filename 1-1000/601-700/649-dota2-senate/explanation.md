# Explanation

Problem: [Dota2 Senate](https://leetcode.com/problems/dota2-senate/)

## Idea

Put Radiant and Dire senator indices into separate queues. Each step compares the next active senator from each party; the earlier one bans the later one and returns to the queue for the next round.

## Why It Works

The smallest queued index is the next active senator for that party. If the Radiant index is smaller, that senator acts before the Dire senator and bans them, so the Radiant senator survives to the next cycle at index `a + n`. The symmetric case keeps the Dire senator. This simulates the optimal greedy action: always ban the next opposing senator who would otherwise act soonest. When one queue becomes empty, only the other party has active senators left and wins.

## Edge Cases

- A single-party input immediately returns that party.
- Adding `n` preserves round order for surviving senators.

## Complexity

- Time: `O(n)`.
- Space: `O(n)`.
