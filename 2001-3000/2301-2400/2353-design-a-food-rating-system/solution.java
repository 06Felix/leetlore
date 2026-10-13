class FoodRatings {
    private Map<String, String> f2c;
    private Map<String, TreeMap<Integer, TreeSet<String>>> c2r;
    private Map<String, Integer> f2r;
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        int n = foods.length;
        this.f2r = new HashMap<>();
        this.f2c = new HashMap<>();
        this.c2r = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];
            c2r.putIfAbsent(cuisine, new TreeMap<>());
            c2r.get(cuisine).putIfAbsent(rating, new TreeSet<>());
            f2r.put(food, rating);
            f2c.put(food, cuisine);
            c2r.get(cuisine).get(rating).add(food);
        }
    }
    
    public void changeRating(String food, int newRating) {
        String cuisine = f2c.get(food);
        int oldRating = f2r.get(food);
        if (newRating == oldRating)
            return;
        TreeMap<Integer, TreeSet<String>> r2f = c2r.get(cuisine);
        r2f.get(oldRating).remove(food);
        if (r2f.get(oldRating).isEmpty())
            r2f.remove(oldRating);
        r2f.putIfAbsent(newRating, new TreeSet<>());
        r2f.get(newRating).add(food);
        f2r.put(food, newRating);
    }
    
    public String highestRated(String cuisine) {
        TreeMap<Integer, TreeSet<String>> r2f = c2r.get(cuisine);
        int lastKey = r2f.lastKey();
        return r2f.get(lastKey).first();
    }
}
