## Idea

- Try DFS from every board cell. Match the next word character, mark the current cell *, explore four neighbors, and restore the character when all branches fail.

## Why It Works

- Each branch follows adjacent matching characters and cannot revisit a marked cell. Trying every start covers every potential word path. Reaching the final character proves a valid occurrence.

## Edge Cases

- A one-character word needs no marking. Case is compared exactly, and failed searches restore their temporary changes.

## Complexity

- O(rows·columns·4^L) conservative time and O(L) word-array/recursion space for word length L.

## Notes

- On success, the method returns before restoring ancestor cells, so the input board keeps * markers along the found path except its final cell. Later searches on that board may fail; the solution is unchanged.
