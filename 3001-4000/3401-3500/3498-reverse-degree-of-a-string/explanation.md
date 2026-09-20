# Reverse Degree of a String

## Idea

- Walk through the string from left to right.
- The string position is `i + 1` because the problem uses 1-indexing.
- The reversed alphabet value of a character is `26 - (ch - 'a')`.
- Add `reversed value * position` for every character.

## Why It Works

- In the normal alphabet, `'a'` starts at offset `0` and `'z'` ends at offset `25`.
- Reversing the alphabet makes `'a'` worth `26`, `'b'` worth `25`, and so on.
- The formula `26 - (s.charAt(i) - 'a')` gives exactly that value.
- Summing each character's contribution directly matches the definition of reverse degree.

## Edge Cases

- A one-character string returns just that character's reversed alphabet value.
- Repeated characters are handled independently because each position has its own multiplier.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Tags

- String
- Simulation
