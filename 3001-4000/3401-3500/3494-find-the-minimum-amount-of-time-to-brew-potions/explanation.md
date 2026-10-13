## Idea

- Compute prefix sums of wizard skills. For each consecutive potion pair, take the maximum required separation between their starting times across all wizards, sum these separations, and add the final potion’s full duration.

## Why It Works

- If the previous potion starts at S and the next at T, wizard i requires T+prefix[i−1]·currentMana≥S+prefix[i]·previousMana. Their maximum difference is the earliest feasible separation. Adjacent potions determine each wizard’s full ordered schedule, so summing minimal separations gives the global earliest finish.

## Edge Cases

- One potion needs only its total processing duration; one wizard processes all potions sequentially. Long products and accumulated times handle large inputs.

## Complexity

- O(nm) time and O(n) space.
