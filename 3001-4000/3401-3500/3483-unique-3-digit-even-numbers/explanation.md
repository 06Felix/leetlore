# Unique 3-Digit Even Numbers

## Idea
- Enumerate ordered selections of three distinct input positions with `itertools.permutations`.
- Keep selections with a nonzero hundreds digit and an even units digit, inserting the constructed number into a set.

## Why It Works
- Permutations use each input position at most once, allowing repeated digit values only when separate copies exist.
- Every constructible three-digit number has an enumerated position selection; the two checks enforce length and parity.
- The set merges equivalent numbers formed from interchangeable copies, giving the count of distinct numbers.

## Edge Cases
- Zero is allowed in the tens or units position, but never first.
- Repeated digits do not inflate the answer; an input with no even digit yields zero.

## Complexity
- Expected time: $O(d^3)$ for $d$ input digits, with constant-time set insertion.
- Space: $O(u)$ for $u$ distinct valid numbers, at most 450, plus the permutation iterator's $O(d)$ storage.

## Notes
- This imported solution is Python. It refers to `itertools` and `List` without imports; standalone execution requires those names to be supplied by the judge environment or imports.
