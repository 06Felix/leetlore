# leetlore

**Proof that suffering can be version controlled.**

A chronicle of LeetCode solutions, failed ideas, breakthrough moments, and everything in between.

## What’s in here?

- Solutions to problems I’ve solved (or eventually bullied into submission)
- Explanations when the code is doing something less obvious than it looks
- Multiple approaches when the first one was technically correct but spiritually unacceptable
- Notes on patterns, tricks, and mistakes worth not repeating

## Repository layout

Problems are filed by question number. Large ranges are split into smaller
100-question shelves, because apparently even the chaos needs an indexing
system.

```text
leetlore/
├── 1-1000/
│   ├── 1-100/
│   │   ├── 1-two-sum/
│   │   │   ├── solution.ext
│   │   │   └── explanation.md
│   │   └── ...
│   ├── 101-200/
│   └── ...
├── 1001-2000/
│   ├── 1001-1100/
│   └── ...
├── 2001-3000/
│   └── ...
└── README.md
```

The outer ranges go up by 1,000. Inside those, the subdirectories go up by
100. Each problem gets its own directory, named with its question ID and a
short slug.

## Solution format

Each question directory contains the code and its explanation:


```text
1-two-sum/
├── solution.ext
└── explanation.md
```

The explanation usually covers the approach, time and space complexity, and
any useful footnotes from the battlefield.

## Lore Fragments

### The brute-force incident

> “I tried so hard and got so far.  
> In the end,  
> the brute force passed.”

### The expected outcome

> “Another one bites the dust.”

`Accepted`

### The confidence issue

> “I am not in danger. I am the danger.”

> *submits solution*

`Wrong Answer`

## Progress

No grand promises here. The goal is consistency, not pretending I’ll solve 500 problems in one montage scene.

I’ll add solutions as I solve them, revisit old ones when they start looking suspicious, and keep the explanations human-readable enough that I can understand them two weeks later.

## A few rules

1. A solution that passes is good. A solution I understand is better.
2. Complexity matters, but so does being able to read the code without summoning a compiler engineer.
3. Failed attempts are allowed. They are evidence.
4. If the code looks overly clever, it probably lost an argument with a simpler approach.

Enjoy the lore. Try not to judge the commit history.
