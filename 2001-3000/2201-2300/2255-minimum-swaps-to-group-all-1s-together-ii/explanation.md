# Explanation

Problem: [Minimum Swaps to Group All 1's Together II](https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-ii/)

## Idea

- Count total ones `ct`.
- Any final grouped block of ones must have length `ct`.
- Slide a length-`ct` window over two copies of the circular array using modulo indices.
- Track the maximum number of ones already inside such a window.
- The answer is `ct - maxOnesInWindow`.

## Why It Works

- In the final arrangement, all ones occupy some circular block of size `ct`.
- For a chosen block, positions already containing `1` need no swap.
- Every zero inside the block must be swapped with a one outside, so swaps needed equal `ct - onesInBlock`.
- Minimizing swaps is therefore equivalent to maximizing ones in any circular block of length `ct`.
- Scanning `2n` positions with modulo covers every circular block start.

## Edge Cases

- If all ones are already grouped circularly, the best window has `ct` ones and the result is `0`.
- If there are no ones, `ct` is `0` and the formula returns `0`.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.

## Notes

- The implementation maintains the current count by removing the element that leaves the window and adding the new element.
