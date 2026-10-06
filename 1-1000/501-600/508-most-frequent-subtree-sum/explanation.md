# Explanation

## Idea
- Use postorder recursion to compute each node's value plus its two child-subtree sums.
- Count each sum in one map. Whenever a sum reaches a new frequency, append it to a second map's bucket for that frequency and update the global maximum.
- Return the bucket corresponding to the final maximum frequency.

## Why It Works
- Children are evaluated before their parent, so every computed total is exactly the sum of that node's subtree.
- Each occurrence increments its sum's frequency once.
- A sum appears once in each frequency bucket it reaches. Any sum recorded in the final maximum bucket must end at that frequency: a later increase would raise the global maximum too.

## Edge Cases
- Negative values and zero sums work as ordinary map keys.
- Tied maximum frequencies return all tied sums; the problem permits any output order.

## Complexity
- Expected time: $O(n)$ with hash-map operations.
- Auxiliary space: $O(n)$ across both maps and their frequency-history lists, plus $O(h)$ recursion depth.

## Notes
- Old entries in lower-frequency buckets are retained intentionally; only the final maximum bucket is returned.
- Both maps and `maxFreq` persist between method calls, so reusing an instance mixes results from different trees. Very deep trees can also exhaust the recursion stack.
