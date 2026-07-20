# Explanation

Problem: [Number of Recent Calls](https://leetcode.com/problems/number-of-recent-calls/)

## Idea

Keep a queue of request times that are still within the last `3000` milliseconds. Add the new time, then remove times smaller than `t - 3000`.

## Why It Works

Calls to `ping` arrive in strictly increasing time order, so expired requests are always at the front of the queue. After adding `t`, removing front values below `t - 3000` leaves exactly the requests in the inclusive range `[t - 3000, t]`. The queue size is therefore the required number of recent calls.

## Edge Cases

- A request exactly at `t - 3000` is kept because the range is inclusive.
- The first ping returns `1`.

## Complexity

- Time: Amortized `O(1)` per `ping`.
- Space: `O(w)`, where `w` is the number of requests in the active time window.
