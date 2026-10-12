## Idea

- Track new learners by day. Maintain the number currently sharing by adding the cohort whose delay just ends and removing the cohort forgetting today. Sum the cohorts still remembering on day n.

## Why It Works

- Each eligible person creates one new learner per day, so dp[t] equals the active sharing count. The sliding cohort interval is t−forget+1 through t−delay. The final sum includes exactly the cohorts not yet forgotten.

## Edge Cases

- People forgetting today cannot share today. Day one begins with one learner; modular subtraction is normalized.

## Complexity

- O(n) time and O(n) space.
