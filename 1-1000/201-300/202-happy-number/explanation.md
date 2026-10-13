## Idea

- Repeatedly replace n by the sum of squared decimal digits while n is greater than four. Return true only when the terminating value is one.

## Why It Works

- A positive 32-bit input reduces after one step to at most 810. In this finite state space, every trajectory reaches one or the unhappy cycle containing four; two and three also feed into that cycle. Therefore stopping at values at most four distinguishes exactly the happy inputs.

## Edge Cases

- One returns true immediately; two, three, and four return false. The digit squares are small exact integers despite using Math.pow.

## Complexity

- O(log n) initial digit-processing time plus a bounded state-space traversal; O(1) space for the 32-bit input domain.

## Notes

- Termination at or below four was verified for every reduced state 1..810.
