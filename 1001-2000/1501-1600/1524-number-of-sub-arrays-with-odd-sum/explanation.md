## Idea
- Track the parity of each prefix using XOR, along with counts of even and odd prefixes seen so far.
- An odd current prefix contributes all previous even prefixes; an even prefix contributes all previous odd prefixes. Reduce the answer modulo 1,000,000,007.

## Why It Works
- A subarray sum is odd exactly when its ending and preceding prefix sums have different parity.
- XOR's lowest bit matches sum parity. Initializing even to one includes the empty prefix, so subarrays starting at index zero are counted.

## Edge Cases
- All-even inputs contribute zero.
- A single odd value contributes one; consecutive odd values alternate prefix parity. Each iteration adds matches before recording the new prefix.

## Complexity
- O(n) time with constant work per value.
- O(1) auxiliary space; input is unchanged.
