# Maximum Repeating Substring

## Idea

- Starting with one copy, repeatedly test whether word repeated ans times occurs in sequence. Stop at the first failed containment test and return ans - 1.

## Why It Works

- If k copies occur consecutively, every smaller positive repetition count occurs as a prefix of that match. Feasibility is therefore contiguous from one through the maximum, making the first failure identify the answer.

## Edge Cases

- If word never occurs, the first test fails and returns zero. A longer word than sequence also fails immediately.

## Complexity

- For sequence length S and word length W, O(S^3 / W + S + W) is a conservative naive-substring-search bound; O(S + W) peak temporary string space. Actual containment cost depends on the JDK.

## Notes

- The implementation rebuilds repeated strings on every test. The small length limits make this direct approach practical.
