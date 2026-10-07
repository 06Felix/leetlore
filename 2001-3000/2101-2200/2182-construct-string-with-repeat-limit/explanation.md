# Explanation

## Idea
- Count the 26 letters and repeatedly choose the largest available letter different from the last output letter.
- Normally append up to `repeatLimit` copies. If the largest remaining letter equals the last output letter, append just one smaller letter as a separator.

## Why It Works
- Choosing the largest legal next letter maximizes the output at its first differing position.
- A single separator lets the larger blocked letter resume as soon as possible. Otherwise the largest available letter can be used up to the run limit immediately.
- If no different letter remains, any leftover copies of the last letter cannot legally extend the constructed run.

## Edge Cases
- With repeat limit one, the greedy alternates letters as availability permits.
- A string containing one letter contributes at most the run limit; unused letters are allowed by the statement.

## Complexity
- Time: $O(n)$ with a fixed 26-letter alphabet; each output group scans the alphabet and appends at least one character.
- Space: $O(n)$ for the builder, temporary character array, and returned string; frequency storage is constant.
