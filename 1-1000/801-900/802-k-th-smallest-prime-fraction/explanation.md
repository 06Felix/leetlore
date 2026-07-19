# Explanation

Problem: [K-th Smallest Prime Fraction](https://leetcode.com/problems/k-th-smallest-prime-fraction/)

## Idea

Use a min-heap of fraction index pairs. For each numerator index `i`, start with the smallest fraction using that numerator: `arr[i] / arr[n - 1]`. Repeatedly pop the smallest fraction and move that numerator to the next smaller denominator.

## Why It Works

For a fixed numerator `arr[i]`, fractions become larger as the denominator index decreases. The heap stores the current smallest not-yet-removed fraction from each numerator sequence. Popping from the heap therefore removes the globally next smallest fraction. After removing `arr[i] / arr[j]`, the next candidate from that same sequence is `arr[i] / arr[j - 1]`, as long as `i < j - 1`. After `k - 1` removals, the heap top is the `k`-th smallest fraction.

## Edge Cases

- With two elements, the heap contains one fraction and it is returned.
- Cross multiplication compares fractions without floating-point precision loss.

## Complexity

- Time: `O((n + k) log n)`.
- Space: `O(n)` for the heap.
