# Explanation

## Idea

Mark every allowed character in a boolean array. Then check each word character by character.

If every character is marked allowed, count the word.

## Why It Works

A word is consistent exactly when all of its letters appear in `allowed`.

The boolean array gives constant-time membership checks for each lowercase letter. The scan stops early on the first disallowed letter.

## Edge Cases

- Single-letter words work through the same loop.
- Duplicate letters in a word are fine as long as that letter is allowed.
- `allowed` has distinct characters, so marking has no conflicts.

## Complexity

Time: `O(|allowed| + total word length)`.

Space: `O(1)`.
