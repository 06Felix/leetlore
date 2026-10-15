# Binary Prefix Divisible By 5

## Idea

- Keep only the current prefix remainder modulo five. Append each bit by shifting left, OR-ing the bit, then reducing modulo five; record whether the remainder is zero.

## Why It Works

- Appending a binary digit transforms a prefix value v into 2v + bit. Modular arithmetic preserves this recurrence without storing the potentially enormous full value.

## Edge Cases

- Leading zeroes and the zero prefix are divisible by five. Every input bit produces one output entry.

## Complexity

- O(n) time and O(1) working space, plus O(n) output.

## Notes

- cur stays between zero and four after reduction, so the shift cannot overflow.
