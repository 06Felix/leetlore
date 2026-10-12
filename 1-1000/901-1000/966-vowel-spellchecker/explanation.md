## Idea

- Insert three representations of each word into a trie: exact case, lowercase, and lowercase with vowels replaced by [. Store a separate index for each level, then query these levels in precedence order.

## Why It Works

- Exact keys encode exact matches; lowercase keys encode capitalization matches; masked keys encode vowel equivalence. Reverse insertion overwrites terminal indices with earlier wordlist indices, guaranteeing the first match. Separate level fields prevent collisions between matching rules.

## Edge Cases

- No matching level returns an empty string. The mask preserves length and consonants, so added or removed vowels do not match.

## Complexity

- Expected O(total wordlist and query characters) time and O(total wordlist characters) trie space with fixed 58-slot child arrays.

## Notes

- Correctness risk outside the usual English locale: toLowerCase() uses the default locale. Turkish case conversion can produce dotless ı from I, which lies outside the trie’s A-through-z index range and can cause an array-index error. The stored implementation is unchanged.
