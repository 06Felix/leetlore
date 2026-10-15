# Number of Substrings With Only 1s

## Idea

- Track cur, the length of the current trailing run of ones. At each one, increment cur and add it to the answer modulo 1,000,000,007; reset cur at zeroes.

## Why It Works

- A run of cur trailing ones gives exactly cur all-one substrings ending at the current index. Counting by ending position includes every valid substring once.

## Edge Cases

- Zeroes break runs. An all-zero string returns zero; an all-one run of length L contributes L(L + 1)/2 before reduction.

## Complexity

- O(n) time and O(n) auxiliary space because the loop uses toCharArray().

## Notes

- Modulo reduction occurs at each addition, keeping int arithmetic safe under the constraints.
