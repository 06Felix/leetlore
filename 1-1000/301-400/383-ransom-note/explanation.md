## Idea

- Count each lowercase letter in both strings and compare the 26 frequencies.

## Why It Works

- Every magazine occurrence may be used once, so the note is constructible exactly when its required count for every letter does not exceed the available count.

## Edge Cases

- Repeated letters require repeated magazine occurrences; surplus letters are harmless.

## Complexity

- O(note length+magazine length) time and O(note length+magazine length+26) temporary space, including toCharArray calls.
