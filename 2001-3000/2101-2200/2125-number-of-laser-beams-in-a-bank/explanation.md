# Number of Laser Beams in a Bank

## Idea

- Count devices in each row. For each nonempty row, add its device count times that of the previous nonempty row; skip empty rows without replacing that previous count.

## Why It Works

- A beam can connect exactly consecutive nonempty rows. Every device in one such row pairs with every device in the other, giving the product; all these row pairs are counted once.

## Edge Cases

- Leading or intervening empty rows contribute nothing. Fewer than two nonempty rows produce zero.

## Complexity

- O(rows * cols) time and O(cols) temporary space because count calls toCharArray().

## Notes

- The code does not mutate bank. The total fits int under the given bounds.
