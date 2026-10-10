## Idea
- Start recursion at the top-left cell expecting label zero.
- At each matching cell, try the eight knight destinations expecting the next label; succeed when the expected label reaches n².

## Why It Works
- Labels are unique, so at most one recursive destination can match the next label. The search therefore follows the recorded tour rather than enumerating arbitrary tours.
- Reaching n² means every label from zero through n² - 1 has been reached by a legal knight move from the required starting square.

## Edge Cases
- A nonzero top-left label fails immediately.
- Invalid intermediate moves fail. The base case intentionally precedes bounds checking because no move after the final labeled square is required.

## Complexity
- O(n²) time: each matching label tries at most eight destinations.
- O(n²) recursive-stack space, at most 49 matching cells under the constraints; grid is unchanged.
