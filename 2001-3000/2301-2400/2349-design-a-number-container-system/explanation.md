## Idea
- Store the current number at each index and a min heap of indices for each number.
- On replacement, explicitly remove the index from its old heap, delete that heap if empty, then insert into the new heap. Unchanged assignments return immediately.
- find returns the requested heap's minimum, or -1 when no heap exists.

## Why It Works
- Each heap contains exactly the indices currently assigned its number, because replacements eagerly remove old memberships.
- The heap minimum is therefore the smallest valid index, with no stale entries to discard.

## Edge Cases
- Finding an unused number returns -1.
- Repeating the same assignment adds no duplicate; moving a number's last index deletes its heap.

## Complexity
- A change costs O(s + log(t + 1)) expected time, where s is the old heap's size and t the new heap's size: PriorityQueue.remove(Object) searches linearly.
- find is O(1) expected time; storage is O(I), where I is the number of assigned indices. A sequence of Q operations can take O(Q²) time.

## Notes
- This is eager heap removal, not lazy deletion. Linear searches on large old heaps create a performance risk with up to 100,000 operations.
