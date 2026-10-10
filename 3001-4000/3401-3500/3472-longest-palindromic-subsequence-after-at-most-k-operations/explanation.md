## Idea
- Use interval DP indexed by left endpoint, right endpoint, and available operation budget.
- Equal endpoints contribute two plus the inner optimum. Otherwise choose between skipping either endpoint and matching both at the circular alphabet distance min(abs(a - b), 26 - abs(a - b)).

## Why It Works
- A palindrome either omits an endpoint or uses both as an equal outer pair; the recurrence compares these possibilities.
- Circular distance is the least total cost of making two characters agree, so pairing consumes exactly the necessary budget. Equal endpoints can be included without spending budget.

## Edge Cases
- Single-character intervals have length one for every budget.
- Adjacent paired endpoints use the zero-initialized empty interval. Wraparound makes a and z cost one rather than twenty-five.

## Complexity
- O(n²(k + 1)) time for all intervals and budgets.
- O(n²(k + 1)) auxiliary space for the three-dimensional DP, plus the character copy.
