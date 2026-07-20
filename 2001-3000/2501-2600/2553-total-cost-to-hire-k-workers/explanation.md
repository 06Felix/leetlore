# Total Cost to Hire K Workers

## Idea

- Maintain two min-heaps: one for current left-side candidates and one for current right-side candidates.
- Use pointers `i` and `j` to add unseen workers into each heap until each side has up to `candidates` workers.
- Each hiring round picks the smaller heap top; ties choose the left heap.
- Add the chosen cost to `ans` and refill before the next round.

## Why It Works

- At any round, the eligible workers are exactly the first and last `candidates` remaining workers.
- The two heaps store those two candidate windows without overlapping because insertion stops when `i > j`.
- Taking the smaller top gives the minimum eligible cost.
- On equal costs, the left heap contains smaller original indices than the right heap, so choosing left matches the tie rule for total cost.

## Edge Cases

- When one side is empty, the other side supplies the hire.
- Overlapping candidate windows are avoided by the `i <= j` guard.
- The answer uses `long` because up to `k` costs are summed.

## Complexity

- Time: $O((n + k) \log c)$, where `c = candidates`.
- Space: $O(c)$ for the two heaps.
