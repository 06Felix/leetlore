# License Key Formatting

## Idea

- Uppercase the input, scan backward while ignoring dashes, and append a separator after each k retained characters. Reverse the builder and remove a leading separator if one was generated.

## Why It Works

- Grouping from the right forces every group except possibly the first to have size k. Reversing restores original character order, and removing a leading separator prevents an empty first group.

## Edge Cases

- An all-dash input produces an empty result. A character count divisible by k generates a removable leading dash.

## Complexity

- O(n) time and O(n) auxiliary/output space.

## Notes

- String.toUpperCase() uses the default locale. Under Turkish locale, English i becomes dotted capital İ rather than I, so formatting is locale-dependent. The existing implementation is unchanged; trim is redundant for the allowed input characters.
