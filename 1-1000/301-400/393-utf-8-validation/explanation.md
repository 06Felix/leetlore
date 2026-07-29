# Explanation

## Idea

- Keep `flw`, the number of continuation bytes still required.
- When `flw` is zero, classify the current byte by its leading bits.
- Set `flw` to `1`, `2`, or `3` for valid multi-byte leaders.
- When `flw` is positive, require each byte to start with binary `10`.

## Why It Works

- UTF-8 validity is determined by a legal leading byte followed by the exact number of continuation bytes.
- The bit shifts compare only the leading pattern needed for each byte class.
- Invalid leading patterns are rejected immediately.
- The final `flw == 0` check rejects incomplete multi-byte characters.

## Edge Cases

- Single-byte values beginning with `0` are accepted.
- Bad or missing continuation bytes return false.
- Values are constrained to `0..255`, so direct bit shifting matches byte checks.

## Complexity

- Time: `O(n)`.
- Space: `O(1)`.
