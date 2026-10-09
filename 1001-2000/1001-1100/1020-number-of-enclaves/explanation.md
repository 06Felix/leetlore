## Idea
- Start DFS from every boundary land cell and turn all reachable land into zero.
- Sum the remaining cells to count land that cannot escape.

## Why It Works
- A land cell can leave the grid exactly when its four-directional component touches the boundary.
- Boundary flood fills erase precisely those components; every remaining one is therefore an enclave cell.

## Edge Cases
- In a single row or column, every land cell is on the boundary and the answer is zero.
- All-water and entirely boundary-connected grids return zero; enclosed components contribute their cell counts, not just one per island.

## Complexity
- O(mn) time because each land cell is erased at most once.
- O(mn) worst-case auxiliary space for the recursive stack.

## Notes
- The implementation mutates grid by erasing boundary-connected land.
- A large connected region can require recursion depth proportional to 250,000 cells under the constraints and may overflow the Java stack.
