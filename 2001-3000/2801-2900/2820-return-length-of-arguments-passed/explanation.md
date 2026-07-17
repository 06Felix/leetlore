# Explanation

## Idea

- Use JavaScript rest parameters: `function(...args)`.
- Rest parameters collect all passed arguments into the array `args`.
- Return `args.length`.

## Why It Works

- The problem asks for the number of arguments passed, not their values.
- JavaScript includes every provided argument in the rest-parameter array, including `null`, objects, arrays, strings, booleans, and numbers.
- The array length is therefore the required count.

## Edge Cases

- No arguments produce an empty array, so the result is `0`.
- `null` and other falsy values are still counted because length depends on positions, not truthiness.
- Object and array arguments count as one argument each.

## Complexity

- Time: $O(1)$ after arguments are collected by the runtime.
- Space: $O(n)$ for the rest-parameter array of passed arguments.
