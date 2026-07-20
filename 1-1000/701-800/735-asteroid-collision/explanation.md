# Explanation

Problem: [Asteroid Collision](https://leetcode.com/problems/asteroid-collision/)

## Idea

Use a stack for asteroids that remain after processing the prefix. Positive asteroids are pushed directly; a negative asteroid collides with smaller positive asteroids on the stack.

## Why It Works

Only a right-moving asteroid followed by a left-moving asteroid can collide. When a negative asteroid arrives, the stack top is the nearest previous survivor. While that top is positive and smaller, it must explode. If the stack becomes empty or the top is negative, the current asteroid survives. If the top has equal size, both explode. If the top is larger, the current asteroid is discarded. This exactly models all possible collisions in order.

## Edge Cases

- Equal-size collisions remove both asteroids.
- Asteroids moving in the same direction never interact and remain stacked.

## Complexity

- Time: `O(n)`, because each asteroid is pushed and popped at most once.
- Space: `O(n)`.
