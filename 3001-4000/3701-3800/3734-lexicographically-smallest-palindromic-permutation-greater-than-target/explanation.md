# Lexicographically Smallest Palindromic Permutation Greater Than Target

## Idea

- A palindrome is fully decided by its left half, optional middle character, and the reverse of the left half.
- Count how many of each character must go into the left half.
- Try to match `target`'s left half as long as possible.
- While matching, also remember the smallest left half that can become strictly larger at the current position.

## Why It Works

- If a palindrome's left half is greater than `target`'s left half, the whole palindrome is definitely greater than `target`.
- If the left halves are equal, the middle and mirrored right side decide whether the full palindrome is strictly greater.
- To get the lexicographically smallest answer, we delay the first larger character as far to the right as possible.
- At that first larger position, using the smallest available larger character and filling the rest with sorted characters gives the smallest valid palindrome for that prefix.

## Edge Cases

- More than one odd character count means no palindromic permutation exists.
- If the smallest palindromic permutation equal to the matched half is already greater than `target`, return it.
- If no larger left half was found, then no valid answer exists.

## Complexity

- Time: `O(n * 26 + n^2)` in this implementation due candidate rebuilding.
- Space: `O(n + 26)`

## Tags

- Greedy
- String
- Palindrome
- Counting
- Lexicographic Order
