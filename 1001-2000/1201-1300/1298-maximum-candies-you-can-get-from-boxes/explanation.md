# Maximum Candies You Can Get from Boxes

## Idea
- Keep a list of possessed boxes, opening every currently unlocked box during a pass.
- Collect candies, unlock discovered keys by updating the status array, and carry locked boxes plus newly contained boxes into the next pass.
- Stop when no box was opened in a pass.

## Why It Works
- Opening an available unlocked box cannot block another opening, so exhausting such boxes collects all reachable candies.
- Rechecking locked boxes lets a key found later unlock an earlier possession; keys alone do not add a box to the possession list.
- If a pass opens nothing, no new keys or boxes can become available, so the remaining boxes are permanently blocked.

## Edge Cases
- An empty initial list returns zero, and keys can arrive before or after possession of their boxes.
- A newly contained box is deferred to a later pass even if already open; the total fits `int` under the candy bounds.

## Complexity
- Time: $O(Bn+K+C)$ as a bound when each box is opened once, for $B$ possessed boxes, $K$ inspected keys, and $C$ inspected containment entries; repeated passes can rescan locked boxes.
- Space: $O(B)$ for the current and next possession lists under that assumption.

## Notes
- The status input, named `vis`, is modified in place when keys are discovered.
- There is no processed-box or possession-deduplication set. Duplicate initial labels, or overlap between initial possessions and later containment, can collect a box's candies more than once; a reachable containment cycle can keep processing forever. The statement's one-container restriction alone does not exclude all of these cases.
