# Assign Cookies

## Idea

- The solution sorts both greed factors and cookie sizes.
- It scans children and cookies from smallest to largest.
- If the current cookie can satisfy the current child, that child is counted and both pointers advance.
- Otherwise only the cookie pointer advances, trying a larger cookie next.

## Why It Works

- Giving the smallest sufficient cookie to the least greedy remaining child preserves larger cookies for greedier children.
- A cookie that is too small for the least greedy remaining child cannot satisfy any later child either.
- Sorting makes this greedy choice locally and globally optimal.

## Edge Cases

- If there are no cookies, the loop returns `0`.
- Extra cookies are ignored after all children are satisfied.
- Equal cookie size and greed factor is sufficient because the condition is `s[j] >= g[i]`.

## Complexity

- Time: $O(g \log g + s \log s)$.
- Space: depends on the sorting implementation.
