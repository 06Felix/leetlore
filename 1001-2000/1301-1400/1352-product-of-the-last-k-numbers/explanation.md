## Idea
- Store prefix products only for the positive suffix after the latest zero, starting with the identity prefix one.
- A zero clears the prefix list. For a query within the suffix, divide the latest prefix product by the prefix before its last k values; a query crossing the latest zero returns zero.

## Why It Works
- Positive suffix products divide exactly, canceling all values before the requested window.
- If fewer than k values have been added since the zero, the requested window includes that zero and its product must be zero.

## Edge Cases
- Consecutive zeros repeatedly reset the state.
- Ones do not change products, and querying the entire nonzero suffix divides by one. The stated contiguous-product bound makes int multiplication safe.

## Complexity
- getProduct is O(1); a nonzero add is amortized O(1).
- A zero add is O(s), because ArrayList.clear clears s stored references. Across a whole stream, adds are amortized O(1), with O(A) allocated space after A additions.

## Notes
- This implementation meets the follow-up in an amortized sense for add, rather than worst-case O(1) per call. Clearing the list retains its allocated capacity.
