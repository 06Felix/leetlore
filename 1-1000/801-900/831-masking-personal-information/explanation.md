# Masking Personal Information

## Idea

- Dispatch on the presence of @. For email, preserve the first and last name letters, insert five stars, append the domain, and lowercase. For phone, scan digits backward, preserve the final four, create masked local groups, and add a masked country prefix when there are more than ten digits.

## Why It Works

- Email construction matches the fixed name mask. Backward phone processing identifies the last four digits independently of separators; all earlier digits become stars, with grouping and reversal restoring the required output layout.

## Edge Cases

- Two-letter email names still receive five inserted stars. Phone country codes have zero through three digits.

## Complexity

- O(n) time and O(n) auxiliary space.

## Notes

- Default-locale toLowerCase() is a correctness risk outside locale-neutral English casing: Turkish locale turns II@EXAMPLE.COM into ı*****ı@example.com instead of i*****i@example.com. Actual Java passed 1000 formatted-phone fixtures, and this locale counterexample was confirmed. Source is unchanged.
