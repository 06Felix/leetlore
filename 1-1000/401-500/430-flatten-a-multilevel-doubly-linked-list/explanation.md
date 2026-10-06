# Explanation

## Idea
- The recursive helper flattens a list and attaches the supplied remainder after it.
- First flatten the original next chain, then flatten the child chain with that next chain as its remainder. Attach the resulting chain after the current node.

## Why It Works
- A null head returns the remainder, which joins the end of each child list to the saved continuation.
- Every node is followed by its flattened children and then its original next chain, giving the required depth-first order.
- Repair each next node's `prev` pointer and clear every `child` pointer as recursion returns.

## Edge Cases
- An empty input returns null; a node without children reconnects directly to its flattened next chain.
- Nested children and children on the last node are handled by the same remainder rule.

## Complexity
- Time: $O(n)$; each node is processed once.
- Auxiliary space: $O(n)$ worst-case recursion depth, including a long ordinary next chain.
