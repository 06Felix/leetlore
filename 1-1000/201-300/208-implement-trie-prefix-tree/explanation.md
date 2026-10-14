## Idea

- Store lowercase words as paths through 26-way trie nodes, marking terminal nodes. Follow characters for search and startsWith; exact search additionally requires the terminal marker.

## Why It Works

- Shared prefixes use shared nodes. A complete path proves a stored prefix, while a terminal marker proves the full word was inserted. These are precisely the two query conditions.

## Edge Cases

- Inserting duplicates only sets the same marker. A prefix may exist without being a stored word.

## Complexity

- O(L) time and O(L) temporary character-array space per operation, plus O(total inserted characters) persistent trie space.
