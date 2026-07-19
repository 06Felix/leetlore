# Explanation

Problem: [Stone Game VI](https://leetcode.com/problems/stone-game-vi/)

## Idea

Sort stones by the combined value `aliceValues[i] + bobValues[i]` in descending order. Alice takes stones at even turns in that order, and Bob takes stones at odd turns.

## Why It Works

Choosing a stone affects both players: if Alice takes it, Bob loses the chance to gain `bobValues[i]`, and Alice gains `aliceValues[i]`. The total swing is therefore the sum of both values. Optimal play prioritizes the largest swings first, so sorting by combined value gives the turn order both players would enforce. After assigning alternating stones, comparing the two collected scores determines the game result.

## Edge Cases

- A tied final score returns `0` through `Integer.compare`.
- The comparator is safe under the constraints because each combined value is at most `200`.

## Complexity

- Time: `O(n log n)`.
- Space: `O(n)` for the paired value array.
