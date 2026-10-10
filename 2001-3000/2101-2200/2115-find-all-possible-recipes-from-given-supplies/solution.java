class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> ans = new ArrayList<>();
        Set<String> suppliesSet = new HashSet<>();
        for (String supply : supplies)
            suppliesSet.add(supply);
        Map<String, List<String>> adj = new HashMap<>();
        Map<String, Integer> ind = new HashMap<>();
        for (int i = 0; i < recipes.length; ++i)
            for (String ingredient : ingredients.get(i))
                if (!suppliesSet.contains(ingredient)) {
                    adj.putIfAbsent(ingredient, new ArrayList<>());
                    adj.get(ingredient).add(recipes[i]);
                    ind.merge(recipes[i], 1, Integer::sum);
                }
        Queue<String> q = Arrays.stream(recipes)
                            .filter(recipe -> ind.getOrDefault(recipe, 0) == 0)
                            .collect(Collectors.toCollection(ArrayDeque::new));

        while (!q.isEmpty()) {
            String u = q.poll();
            ans.add(u);
            if (!adj.containsKey(u))
                continue;
            for (String v : adj.get(u)) {
                ind.merge(v, -1, Integer::sum);
                if (ind.get(v) == 0)
                    q.offer(v);
            }
        }
        return ans;
    }
}
