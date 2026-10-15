# Coupon Code Validator

## Idea

- Reject empty or invalid-character codes, inactive coupons, and unrecognized business lines. Collect valid codes into four category lists, sort each lexicographically, and concatenate them in the required category order.

## Why It Works

- Validation applies every required predicate before a code enters its category. Sorting within categories provides the secondary order, while concatenating the category lists provides the primary order.

## Edge Cases

- Underscores are valid. Empty codes and printable punctuation are rejected. Duplicate valid coupon codes are retained as separate coupon entries.

## Complexity

- O(n * L + n log(n) * L) time for maximum input string length L. O(n + L) auxiliary space for lists, sorting, and temporary character arrays, plus returned references.

## Notes

- Character.isLetterOrDigit accepts more than ASCII generally, but the statement restricts input to printable ASCII, where this matches the required alphanumeric set. The input arrays are unchanged.
