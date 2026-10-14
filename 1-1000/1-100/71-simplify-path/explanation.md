## Idea

- Parse slash-separated components into a deque. Ignore empty components and ., remove the final component for .., and join retained names with leading slashes.

## Why It Works

- The deque always represents the canonical path of the parsed prefix. Each ordinary component descends one level, while .. cancels exactly the most recent descent. Ignoring repeated slashes and . preserves location. Joining removes redundant separators.

## Edge Cases

- Moving above root safely does nothing. Names such as ... remain ordinary components; root returns /.

## Complexity

- O(path length) time and space.
