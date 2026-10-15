# Number of Ways to Rearrange Sticks With K Sticks Visible

## Idea

- Recursively compute f(n, k) = f(n - 1, k - 1) + (n - 1) * f(n - 1, k), reducing modulo 1000000007 and caching nonzero results. Use one for n = k and zero for k = 0.

## Why It Works

- Insert the shortest stick into an arrangement of the other n - 1 sticks. At the front it becomes visible and requires k - 1 previously visible sticks; in any of the other n - 1 positions it is hidden and leaves k visible sticks. These disjoint insertion choices give the recurrence.

## Edge Cases

- All n sticks visible forces increasing order. No nonempty arrangement has zero visible sticks.

## Complexity

- O(n * k) distinct DP states with constant work per evaluation; zero-residue recomputations can add work. Space includes a fixed 1001-by-1001 long table and O(n) recursion depth.

## Notes

- The static table is reusable because values depend only on n and k. Zero also marks an uncomputed state, so a true count divisible by MOD is not effectively cached. Visibility counts matched exhaustive permutations through n = 7.
