## Idea

- Maintain a sliding window and counts in a 128-entry array. Add each new character, shrink until its count is one, and update the longest window length.

## Why It Works

- The previous window has no duplicates, so only the new character can violate uniqueness. Shrinking past its earlier occurrence restores the invariant while leaving the longest valid suffix for this right endpoint.

## Edge Cases

- The empty string returns zero. Spaces and punctuation count as ordinary characters.

## Complexity

- O(length) time and O(length+128) space, including toCharArray.

## Notes

- The fixed count array assumes characters have codes below 128. Non-ASCII symbols would cause an array-index error; the implementation is appropriate for the usual ASCII interpretation of this input alphabet.
