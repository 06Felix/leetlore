## Idea

- Map each Roman symbol to its value. Subtract a symbol when the next symbol is larger; otherwise add it. Always add the final symbol.

## Why It Works

- Valid Roman notation represents subtractive pairs by a smaller symbol immediately before a larger one. The signed contributions give larger−smaller for each pair and positive contributions for every ordinary symbol.

## Edge Cases

- Single-symbol numerals and repeated symbols are handled directly. The statement guarantees valid Roman syntax.

## Complexity

- O(length) time and O(length) auxiliary space for the character array.
