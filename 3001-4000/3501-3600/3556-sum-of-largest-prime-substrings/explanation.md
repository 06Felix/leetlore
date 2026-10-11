# Sum of Largest Prime Substrings

## Idea
- Enumerate every substring, parse its integer value, and deduplicate values in an unordered set.
- Test unique values for primality by trial division, push primes into a max-heap, and sum at most three heap maxima.

## Why It Works
- Substring enumeration covers every candidate, while integer conversion discards leading zeros and the set merges duplicate numerical values.
- After excluding multiples of two and three, any remaining prime factor has form $6a-1$ or $6a+1$, covering the divisors tested through the square root.
- A max-heap exposes the largest distinct primes in descending order.

## Edge Cases
- Zero and one are not prime; fewer than three available primes are all summed.
- Ten-digit values and the sum of three primes fit `long long`; repeated or zero-padded substrings count only once.

## Complexity
- Expected time: $O(n^3+u\sqrt V+p\log p)$ for substring copying/parsing, $u$ unique values bounded by $V$, and $p$ primes.
- Space: $O(u+p+n)$ for the set, heap, and temporary substring.

## Notes
- This imported implementation is C++, using the judge's standard-library headers and namespace setup.
- The small length bound makes direct substring enumeration and trial division practical.
