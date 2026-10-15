# Count Primes

## Idea

- Initialize primality flags below n, excluding zero and one. For each remaining prime i with i^2 < n, mark its multiples starting from i^2 as composite. Count true flags.

## Why It Works

- Every composite has a prime factor at most its square root. Smaller multiples of i already have a smaller prime factor and were marked earlier, so starting at i^2 covers all remaining composites without removing primes.

## Edge Cases

- n <= 2 returns zero. The array ends at n - 1, so n itself is never counted.

## Complexity

- O(n log log n) time and O(n) auxiliary space.

## Notes

- The i * i loop condition is safe for n <= 5000000. This implementation performs a final scan to count surviving flags.
