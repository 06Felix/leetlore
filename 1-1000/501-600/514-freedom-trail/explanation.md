# Explanation

## Idea

- Use DFS with memoization over the current ring orientation and key index.
- For the next key character, try rotating to every matching position in the current ring.
- Add rotation cost now plus the best remaining cost recursively; add button presses separately as `key.length()`.

## Why It Works

- At each step, only positions containing the needed key character are useful.
- Rotating to position `i` costs `min(i, ring.length() - i)` from the current orientation.
- Rebuilding the ring with that position first represents the new orientation for later characters.
- Memoization avoids recomputing the same orientation/index state.

## Edge Cases

- Characters already aligned cost `0` rotation plus one press.
- Repeated characters in the ring are all considered.
- The problem guarantees every key character exists in the ring.

## Complexity

- Time: exponential without memoization, reduced by cached orientation/index states.
- Space: proportional to the number of memoized states plus recursion depth.
