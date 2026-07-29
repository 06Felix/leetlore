# Explanation

## Idea

- For each word, build a KMP LPS array for `word + '#' + target`.
- For a remaining target prefix length `req`, the LPS value at `word.length() + req` gives the longest prefix of that word matching a suffix of `target[0..req)`.
- Repeatedly remove the longest valid suffix chunk from the remaining target prefix.
- Count removals; if no word can match a positive suffix length, return `-1`.

## Why It Works

- A valid string is any prefix of any word.
- The LPS computation tells how long a word prefix matches each target suffix ending position.
- Because the set of valid strings is prefix-closed, choosing the longest available suffix chunk cannot make the remaining prefix harder than choosing a shorter chunk.
- Peeling chunks from the end until `req == 0` therefore minimizes the number of valid strings.

## Edge Cases

- If every word has zero suffix match for the current `req`, the target cannot be formed.
- Exact full-word prefix matches and shorter prefix matches are both handled by LPS lengths.
- The separator `#` prevents matches from crossing between the word and target parts.

## Complexity

- Time: `O(sum(words[i].length + target.length) + ans * words.length)`.
- Space: `O(sum(words[i].length + target.length))` for all LPS arrays.
