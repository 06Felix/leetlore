# Different Ways to Add Parentheses

## Idea

- Treat each operator as the final operation for one parenthesization.
- Recursively compute all possible results for the left and right substrings.
- Combine every left result with every right result using the operator.

## Why It Works

- Every valid parenthesization has some operator evaluated last.
- Splitting at that operator separates the expression into independent left and right subexpressions.
- Combining all results from both sides enumerates every result produced by that last-operation choice.
- If no operator exists, the substring is a number and becomes the base result.

## Edge Cases

- Single-number expressions return that number.
- Duplicate numerical results are preserved because different parenthesizations can produce the same value.
- Multi-digit numbers work because the base case parses the whole numeric substring.

## Complexity

- Time: exponential in the number of operators, proportional to the number of generated parenthesization results.
- Space: exponential for recursive result lists.
