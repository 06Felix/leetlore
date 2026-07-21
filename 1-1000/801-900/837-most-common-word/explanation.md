# Most Common Word

## Idea

- Convert the paragraph to lowercase.
- Store banned words in a `HashSet`.
- Parse the paragraph character by character, building alphabetic tokens.
- Count every completed token in a map, then choose the highest-count word not in the banned set.

## Why It Works

- Lowercasing makes comparisons case-insensitive.
- Non-letter characters act as separators, so punctuation is ignored.
- The frequency map stores how often each normalized word appears.
- The final scan filters banned words and keeps the maximum remaining count.

## Edge Cases

- A trailing word is counted after the loop.
- Multiple punctuation marks do not create empty words because tokens are added only when non-empty.
- The answer is guaranteed unique, so no tie handling is needed.

## Complexity

- Time: $O(P + B)$ for paragraph length `P` and banned count `B`, plus token-string construction costs.
- Space: $O(W + B)$ for distinct words and banned words.

## Notes

- The implementation counts banned words too, then filters them only when selecting the answer. This is correct but does extra map work.
- Token building uses repeated string concatenation, which is acceptable for the small paragraph constraint but less efficient than `StringBuilder`.
