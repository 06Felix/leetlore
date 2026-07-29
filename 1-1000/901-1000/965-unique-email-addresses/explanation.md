# Unique Email Addresses

## Idea

- Split each email into local name and domain at `'@'`.
- In the local part, ignore everything after the first `'+'`.
- Remove all dots from the remaining local part.
- Store the normalized address in a set.

## Why It Works

- Dots only affect the local name visually and do not change delivery.
- A plus sign causes the rest of the local name to be ignored.
- The domain is kept unchanged because neither rule applies there.
- The set keeps only distinct normalized recipient addresses.

## Edge Cases

- Local names without `'+'` remain fully considered after dot removal.
- Domains may contain dots, and those dots are preserved.
- Duplicate normalized emails collapse to one set entry.

## Complexity

- Time: `O(totalChars)` over all email strings.
- Space: `O(totalChars)` for normalized addresses in the set.
