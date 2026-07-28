# Explanation

## Idea

Accumulate total word counts per sender in a map. Then scan the map to find the largest total, breaking ties by lexicographically larger sender name.

Word counts come from splitting each message on spaces.

## Why It Works

Every message belongs to exactly one sender, so merging its word count into that sender's total gives the required aggregate.

The final scan compares each sender with the current best. A sender replaces the answer if it has a larger total, or if it ties and has a larger name.

## Edge Cases

- Multiple messages from the same sender are summed.
- Names are case-sensitive because `String.compareTo` is case-sensitive.
- Messages have single spaces with no leading/trailing spaces, so `split(" ")` gives the word count.

## Complexity

Time: `O(total message length + U)`, where `U` is the number of senders.

Space: `O(U)`.
