## Idea
- First union all variable pairs connected by equality equations.
- Then reject any inequality whose endpoints have the same representative; otherwise accept.

## Why It Works
- Equality is transitive, so union-find groups exactly the variables forced to have equal values.
- An inequality inside a component is impossible. If all inequalities cross components, assigning a different integer to each component satisfies every equation.

## Edge Cases
- x == x is harmless; x != x is immediately contradictory.
- Equalities are fully processed before inequalities, so input order cannot hide an indirect contradiction.

## Complexity
- O(q) time for q equations: each find traverses at most the fixed 26 variables.
- O(1) auxiliary space, including arrays and recursion bounded by 26.
