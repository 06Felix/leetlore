# Explanation

## Idea

Count available characters from `chars`. For each word, clone that count array and consume its letters.

If any count becomes negative, the word cannot be formed.

## Why It Works

Each character from `chars` can be used once per tested word, so a fresh clone correctly resets availability for every word.

When all decrements stay nonnegative, the word uses no character more times than available and contributes its length.

## Edge Cases

- Duplicate letters in a word are checked by repeated decrements.
- Words that fail subtract their length before the common add at loop end.
- Only lowercase English letters are present, so a 26-size array is enough.

## Complexity

Time: `O(|chars| + total word length + 26 * words.length)`.

Space: `O(1)`.
