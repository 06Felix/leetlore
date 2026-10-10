## Idea
- Memoize a state by the next unread index and the value of the one carried element at the front.
- With three available front elements, try each choice of survivor, pay the maximum of the removed pair, and advance by two unread elements.
- When fewer than three remain, remove all of them for their maximum value. Handle the initial first-three choice explicitly.

## Why It Works
- After every two-element removal, the remaining array is exactly one survivor followed by an untouched suffix, so the state captures all future decisions.
- The three branches enumerate every legal removal. Minimum branch cost plus the optimal memoized continuation gives the optimal total; survivor identity is irrelevant when its value is the same.

## Edge Cases
- One or two input elements are handled directly.
- Duplicate survivor values share a memo state, and both odd and even lengths reach the correct final removal.

## Complexity
- O(n²) expected time and memo space: O(n) unread indices each have at most n possible survivor values.
- O(n) recursion depth; long holds intermediate costs and the final value fits int under the constraints.
