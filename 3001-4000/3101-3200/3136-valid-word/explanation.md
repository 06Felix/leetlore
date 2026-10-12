## Idea

- Reject words shorter than three. Scan characters, count vowels and consonants, and reject any character that is neither a letter nor a digit.

## Why It Works

- The scan checks the allowed-character condition for every position and records whether both required letter categories occur. Returning true only when both counts are positive enforces all four rules.

## Edge Cases

- Uppercase vowels are explicitly recognized. Digits satisfy the allowed-character rule but count as neither vowels nor consonants.

## Complexity

- O(n) time and O(n) space for the character array.

## Notes

- Character.isLetter and isDigit recognize Unicode categories more broadly than English letters and ASCII digits. This is safe under the statement’s restricted input alphabet; arbitrary Unicode input would need stricter validation.
