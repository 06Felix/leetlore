## Idea
- Maintain counts and sums of good subsequences grouped by their final value.
- For value x, create its singleton and extend every earlier subsequence ending at x - 1 or x + 1. Add the new counts and sums to the state for x.
- Sum all final-value sums and apply the modulus only at the end.

## Why It Works
- A nonsingleton good subsequence ending at x has a unique preceding last value, either x - 1 or x + 1.
- Each extension adds the previous subsequence sum plus x; counts supply how many copies of x must be added. Keeping earlier states for x preserves subsequences that omit this occurrence.

## Edge Cases
- Repeated occurrences count as different index choices but cannot extend each other directly.
- Zero is supported, including the absent negative-one state supplied by Counter. A singleton contributes its value.

## Complexity
- O(n) expected dictionary operations, but integer arithmetic is not constant-time here.
- With D distinct values, counts and sums can grow to O(n + log(n(M + 1))) bits, where M is the greatest value. A conservative bit-cost bound is O((n + D)(n + log(n(M + 1)))) time and O(D(n + log(n(M + 1)))) bits of state.

## Notes
- No intermediate count or sum is reduced modulo 1,000,000,007. Python preserves correctness with arbitrary-size integers, but alternating adjacent values can produce very large integers and a substantial runtime/memory risk at n = 100,000.
- The file assumes Counter is provided by the judge environment; it has no explicit import.
