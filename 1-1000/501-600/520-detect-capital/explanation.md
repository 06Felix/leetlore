# Detect Capital

## Idea

- If the first two letters are uppercase, require every remaining letter to be uppercase. Otherwise require every letter after the first to be lowercase. Accept single letters directly.

## Why It Works

- Two leading uppercase letters force the all-capitals pattern. Every other valid pattern has only lowercase letters after the first, covering both all-lowercase and initial-capital words.

## Edge Cases

- Any one-letter word is valid. An uppercase letter after a lowercase prefix is rejected.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The statement restricts the input to English letters, so Character case predicates cover every input character.
