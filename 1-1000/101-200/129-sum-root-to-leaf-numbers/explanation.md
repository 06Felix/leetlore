## Idea

- Carry a decimal prefix through DFS, forming prefix·10+node.val. Add that value to a field when a leaf is reached.

## Why It Works

- Appending one digit multiplies the previous prefix by ten and adds the digit. Each leaf receives exactly its root-to-leaf number, and visiting every leaf once sums all required numbers.

## Edge Cases

- Zero digits are retained in the decimal construction. The stated depth and answer limits keep int arithmetic valid.

## Complexity

- O(n) time and O(h) recursion space.

## Notes

- State reuse risk: ans is initialized only when the Solution object is created and is not reset in sumNumbers. Repeated calls on the same object accumulate earlier results; normal fresh-instance usage is correct.
