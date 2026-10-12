## Idea

- Convert the number to characters and change its first six to nine.

## Why It Works

- Changing six to nine increases the number by three times that digit’s place value. The leftmost six has the largest place value, and changing a nine to six would decrease the result.

## Edge Cases

- An all-nine number stays unchanged; changing at most one digit is allowed.

## Complexity

- O(d) time and space for d digits.
