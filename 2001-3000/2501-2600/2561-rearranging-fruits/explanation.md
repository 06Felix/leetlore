## Idea

- Compare frequencies, collect surplus fruits, and swap the cheapest surplus values, optionally through the global minimum.

## Why It Works

- Every value must have even total surplus. Pairing opposite surpluses yields the direct swap cost; routing through the smallest fruit costs twice its value and can be cheaper.

## Edge Cases

- Odd total frequency makes balancing impossible; identical surpluses cost zero.

## Complexity

- O(n log n) time and O(n) space.
