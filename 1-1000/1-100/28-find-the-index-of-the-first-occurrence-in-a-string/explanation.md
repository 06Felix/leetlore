## Idea

- Call String.indexOf(needle) on the haystack and return the resulting first index or −1.

## Why It Works

- The standard method searches for the first complete substring occurrence and reports −1 when no occurrence exists, exactly matching the requested behavior.

## Edge Cases

- A match at the first position returns zero. A needle longer than the haystack has no match.

## Complexity

- Conservative O(haystack length·needle length) worst-case time for substring search; no explicit auxiliary allocation in this wrapper.

## Notes

- The precise search implementation and internal storage depend on the Java runtime.
