# Explanation

## Idea
- Check that the sentence's first and last characters match.
- For each separating space, compare the character immediately before it with the character immediately after it.

## Why It Works
- The characters surrounding each space are exactly the last character of one word and first character of the next.
- The endpoint comparison checks the remaining connection from the final word back to the first.
- Passing every connection is precisely the definition of a circular sentence.

## Edge Cases
- A one-character sentence is circular; a longer single word depends only on its endpoints.
- Character comparisons are case-sensitive. Single spaces and the absence of leading or trailing spaces guarantee safe neighbor indexing.

## Complexity
- Time: $O(L)$ for sentence length `L`.
- Auxiliary space: $O(1)$.
