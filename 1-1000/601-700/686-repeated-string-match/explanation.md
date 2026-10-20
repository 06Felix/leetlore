# Repeated String Match

## Idea

- Let r = ceil(b.length / a.length). Build r copies of a and test containment; if that fails, append one more a and test again. Otherwise return -1.

## Why It Works

- Fewer than r copies cannot hold b by length. In an infinite repetition, any match begins within the first a-length period; the extra copy supplies enough characters for every such alignment. Thus r and r + 1 cover all possible minimum lengths.

## Edge Cases

- A match may cross repeated-copy boundaries. A missing required character causes both tests to fail.

## Complexity

- O((A + B) * B) conservative worst-case time for ordinary substring searches and O(A + B) storage, where A and B are the two string lengths. Actual search performance depends on the JDK.

## Notes

- Both inputs are nonempty, so the repetition count is positive. The code builds the repeated string with Collections.nCopies and String.join.
