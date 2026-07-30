# Minimum Number of Pushes to Type Word I

## Idea

There are 8 usable keys: `2` to `9`.

Since every character in `word` is distinct, frequency does not matter. Each letter is typed exactly once.

To minimize pushes, put as many letters as possible in the cheapest positions:

- first 8 letters need `1` push each
- next 8 letters need `2` pushes each
- next 8 letters need `3` pushes each
- remaining letters need `4` pushes each

So the answer depends only on `word.length()`.

## Formula

Let:

```text
n = word.length()
comp = n / 8
rem = n % 8
```

`comp` tells how many full groups of 8 letters are filled.

The full groups contribute:

```text
8 * (1 + 2 + ... + comp)
```

Using the sum formula:

```text
8 * comp * (comp + 1) / 2
```

The leftover `rem` letters go into the next push level, so they contribute:

```text
(comp + 1) * rem
```

Final answer:

```text
8 * comp * (comp + 1) / 2 + (comp + 1) * (n % 8)
```

## Why It Works

The first position on each key costs `1` push, and there are 8 such positions.

After those are used, the next available positions all cost `2` pushes, then `3`, and so on.

Because all letters are distinct and used once, there is no reason to prefer one letter over another. We only need to fill the cheapest available positions first.

## Edge Cases

- If `n <= 8`, every letter needs one push, so the answer is `n`.
- If `n` is a multiple of 8, there is no leftover group.
- The maximum length is 26, so at most 4 pushes are ever needed for a letter.

## Complexity

- Time: `O(1)`
- Space: `O(1)`

## Tags

- Math
- Greedy
- String
