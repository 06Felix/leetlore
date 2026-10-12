## Idea

Breadth-first search candidate strings using letters occurring at least k times. Extend a candidate only if k consecutive copies are a subsequence of s; a greedy scan checks this condition.

## Why It Works

If a repeated candidate is feasible, every prefix is also feasible, so pruning invalid extensions cannot discard an answer. Breadth-first traversal visits shorter lengths first. Ascending letter order visits each length lexicographically, so replacing the answer on every valid candidate leaves the lexicographically largest string at the maximum length.

## Edge Cases

Letters occurring fewer than k times cannot appear. The constraint n < 8k limits feasible candidate lengths to at most seven.

## Complexity

For Q tested candidates and maximum candidate length L, time is O(Q(n+L)). Space is O(n+FL), where F is the largest queue size; each check creates a character array. Candidate enumeration is exponential in L.

## Notes

The greedy checker advances through s and counts complete copies without reusing positions.
