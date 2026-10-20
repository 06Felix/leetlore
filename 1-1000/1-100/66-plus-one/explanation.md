# Plus One

## Idea

- Walk digits from right to left. Increment and return at the first digit below nine; turn each nine into zero while propagating the carry. If all digits were nine, return a new array one position longer with a leading one.

## Why It Works

- Decimal addition propagates a carry exactly through trailing nines. The first smaller digit absorbs it and leaves earlier digits unchanged. If every digit carries, the result is one followed by the original number of zeroes.

## Edge Cases

- Zero becomes one. Inputs such as 99 need an additional digit.

## Complexity

- O(n) worst-case time and O(1) working space, with an O(n) returned allocation only for the all-nine case.

## Notes

- The input digits are modified in place; the usual return is that same array. In the all-nine case, the original array has been zeroed before a new result is allocated.
