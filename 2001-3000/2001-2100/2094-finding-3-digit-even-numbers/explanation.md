# Finding 3-Digit Even Numbers

## Idea
- Count the available copies of each digit.
- Enumerate hundreds digits 1 through 9, tens digits 0 through 9, and even units digits, checking that all required copies exist.

## Why It Works
- The digit loops generate every three-digit even number exactly once and in increasing numeric order.
- The tens check reserves a copy already used for the hundreds digit; the units check reserves both earlier copies when their values match.
- Thus the frequency tests enforce the input multiplicities without needing a deduplication set.

## Edge Cases
- Zero may appear after the first digit, but never as the hundreds digit.
- Repeated-digit candidates require two or three copies as appropriate; no available even units digit produces an empty array.

## Complexity
- Time: $O(d+450)$ for $d$ input digits and all candidates, plus output conversion.
- Space: $O(10+u)$ for counts, the result list, and returned array of $u$ numbers.
