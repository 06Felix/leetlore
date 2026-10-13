## Idea

- Pack the largest word group fitting each line with at least one space per gap. For completed lines, distribute all needed spaces round-robin across gaps; left-justify the final line and right-pad it.

## Why It Works

- The fit test counts existing letters, required gaps, and the new word. Round-robin padding gives each gap either floor(spaces/gaps) or one more, assigning the extra spaces to leftmost gaps. The last line instead joins with single spaces, matching the distinct final-line rule.

## Edge Cases

- A one-word line receives all padding after the word. Every word fits alone by the stated constraint.

## Complexity

- O(total output characters+word count) time and O(maxWidth) auxiliary space beyond the output lines.
