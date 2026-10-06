# Explanation

## Idea
- Compute the factor score of the full array as an initial candidate.
- For each possible removed index, build a copy of all other elements, recompute their GCD and LCM, and maximize their product.
- Use Euclid's algorithm for GCD and compute LCM as `(a / gcd(a, b)) * b`.

## Why It Works
- Keeping every element and deleting each single index enumerate all allowed choices.
- Repeated GCD and LCM reductions produce the common divisor and common multiple for exactly the chosen array.
- Taking the maximum score across these candidates yields the required optimum.

## Edge Cases
- For one positive element, keeping it gives its square and is optimal.
- Repeated values, ones, and cases where keeping all elements is best are included in the enumeration.

## Complexity
- Time: $O(n^2 \log U)$ as a bound on GCD work, with $U$ bounding intermediate operands; under values 1 through 30 these operands have a fixed bound, giving $O(n^2)$ in `n`.
- Auxiliary space: $O(n)$ for the temporary array.

## Notes
- The helpers return one for an empty array, making its computed score one instead of the specified zero. This occurs only after deleting the sole element and cannot change the answer because retaining a positive singleton scores at least one.
- Arithmetic uses `long`, with division before multiplication in LCM; the small allowed values bound the LCM and score within its range.
