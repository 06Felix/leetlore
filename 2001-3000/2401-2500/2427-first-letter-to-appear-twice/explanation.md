# First Letter to Appear Twice

## Idea

- The implementation uses a fixed count array for lowercase letters.
- It scans the string from left to right.
- Before incrementing a character's count, it checks whether that character has already appeared once.
- The first character satisfying that check is returned.

## Why It Works

- The answer is determined by the earliest second occurrence.
- Scanning left to right reaches second occurrences in increasing index order.
- When `arr[ch - 'a'] == 1`, the current index is exactly that character's second appearance.
- The problem guarantees at least one repeated character, so a valid return occurs before the fallback.

## Edge Cases

- If only one character repeats, it is returned when seen the second time.
- Multiple later repeats do not matter because the first second occurrence returns immediately.
- The fixed array is valid because the string contains only lowercase English letters.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
