## Idea

- Write the sign and integer part, then simulate long division. Map each remainder to the string position before generating its next digit; insert parentheses when a remainder repeats.

## Why It Works

- A remainder completely determines all following division digits. Seeing it again identifies the start of the repeating cycle. A zero remainder ends a finite decimal, so the algorithm produces precisely the terminating prefix or recurring representation.

## Edge Cases

- Zero numerator returns zero. Casting to long before absolute value handles Integer.MIN_VALUE; opposite signs produce one minus sign.

## Complexity

- Expected O(L) time and O(L) space for L output digits, including a possible parenthesis insertion.
