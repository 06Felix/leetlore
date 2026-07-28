# Smallest Palindromic Rearrangement I

## Idea

Since `s` is already guaranteed to be palindromic, its character counts can form a palindrome.

To make the smallest palindrome lexicographically, the left half should be as small as possible. That means we place smaller characters first.

For example, if the available pairs are:

```text
a a, b b, c c
```

the best left half starts as:

```text
abc
```

Then the right half is just the reverse:

```text
abc + cba
```

## Building the Answer

The code first counts every character in `freq`.

For each character from `'a'` to `'z'`:

- put `freq[i] / 2` copies into the left half
- if `freq[i]` is odd, remember that character as the middle character

There can be at most one odd-count character because the input can form a palindrome.

After the left half is ready:

```text
answer = left + middle + reverse(left)
```

If there is no middle character, the answer is simply:

```text
left + reverse(left)
```

## Why It Works

In any palindrome, the first character is decided by the left half.

So to get the lexicographically smallest palindrome, we should make the left half lexicographically smallest.

Sorting the left half by character order does exactly that. The middle character only matters after the whole left half is fixed, and the right half is forced by symmetry.

## Edge Cases

- A single-character string returns itself.
- Even-length palindromes have no middle character.
- Odd-length palindromes have exactly one middle character.
- Repeated characters are handled naturally by using half of each frequency on the left.

## Complexity

- Time: `O(n + 26)`
- Space: `O(n)`

## Tags

- String
- Greedy
- Counting
- Palindrome
