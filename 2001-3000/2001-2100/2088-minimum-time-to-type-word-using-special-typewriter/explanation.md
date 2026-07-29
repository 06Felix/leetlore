# Minimum Time to Type Word Using Special Typewriter

## Idea

- Track the current pointer character, initially `'a'`.
- For each target character, compute the clockwise/counterclockwise distance on the 26-letter ring.
- Add the shorter movement distance, then add one second per typed character at the end.

## Why It Works

- The ring distance between two letters is `min(diff, 26 - diff)`.
- Each character must be typed exactly once, independent of movement.
- Updating the current pointer after each character makes the next movement start from the correct letter.

## Edge Cases

- Typing `'a'` first costs no movement, only one typing second.
- Wraparound moves such as `a` to `z` use distance `1`.
- Repeated letters add only typing time between them.

## Complexity

- Time: `O(n)`, where `n` is `word.length()`.
- Space: `O(1)`.
