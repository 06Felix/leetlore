# Closest Prime Numbers in Range

## Idea

- Scan numbers from two through right using a composite sieve. Each unmarked value is prime; if it lies in range, compare its gap with the preceding in-range prime. Then mark every multiple of that prime, starting with itself.

## Why It Works

- An unmarked number cannot have a smaller prime factor, so it is prime when reached. The closest pair in a sorted prime list must be adjacent. Updating only for a strictly smaller gap preserves the smallest first prime in a tie.

## Edge Cases

- Fewer than two in-range primes leave [-1, -1]. The preceding-prime variable is updated only for primes at least left.

## Complexity

- O(right * log log right) time and O(right) auxiliary space.

## Notes

- The sieve flag means already marked, not prime. Starting at the prime itself makes its flag true after it has been processed; this is intentional and does not affect later detection.
