## Idea
- Try starting digits in ascending order and backtrack with a used-digit array.
- For I, try unused larger digits in ascending order; for D, try unused smaller digits in descending order. Stop at the first complete number.

## Why It Works
- Every candidate obeys the next comparison and uses each digit at most once; backtracking removes choices that cannot finish.
- At the start or after I, the smallest feasible next digit leaves enough unused smaller digits for the following D-run. That minimal feasible choice has exactly the required smaller digits available, forcing their descending order along the run.
- Consequently the first completed branch minimizes each earliest differing position, despite the descending candidate order used inside a D-run.

## Edge Cases
- All I yields consecutive increasing digits; all D requires the smallest sufficient starting digit followed by descending digits.
- Failed branches restore used flags. At most nine digits are needed, and their numeric concatenation fits int.

## Complexity
- O(9 × 9!) is a conservative bound for enumerating distinct-digit prefixes with bounded candidate loops.
- O(n) recursive-stack space and ten used flags; n <= 8.

## Notes
- The algorithm's first-result order was checked against the standard run-reversal construction for every I/D pattern of lengths one through eight.
