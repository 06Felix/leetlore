# Find All Possible Recipes from Given Supplies

## Idea
- Ignore ingredients already present in the supplies set; count each recipe's remaining dependencies.
- Build ingredient-to-dependent-recipe edges, then queue recipes with no remaining dependencies.

## Why It Works
- A queued recipe has every ingredient available, so producing it safely unlocks its dependents.
- Processing a recipe decreases each dependent's unresolved count exactly once. A count of zero means all required ingredients are available.
- Missing ingredients and unseeded cycles never enter the queue, so their recipes remain blocked.

## Edge Cases
- Recipes made entirely from supplies enter the initial queue; chains become available in dependency order.
- A supplied ingredient need not be a recipe. Ingredients absent from both supplies and producible recipes keep their dependents blocked.

## Complexity
- Expected time: $O(n + e + s)$, for $n$ recipes, $e$ ingredient entries, and $s$ supplies, treating bounded-length string operations as constant time.
- Space: $O(n + e + s)$ for dependencies, counts, queue, supplies, and output.
