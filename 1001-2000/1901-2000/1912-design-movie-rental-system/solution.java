class MovieRentingSystem {
    private Map<Integer, TreeSet<T>> m2e = new HashMap<>();
    private Set<T> rented = new TreeSet<>(compare);
    private Map<Long, T> k2e = new HashMap<>();

    private static class T {
        int movie;
        int shop;
        int price;
        public T(int movie, int shop, int price) {
            this.movie = movie;
            this.shop = shop;
            this.price = price;
        }
    }
    
    private static final Comparator<T> compare = (T1, T2) -> {
        return T1.price == T2.price ? T1.shop == T2.shop 
                                        ? T1.movie - T2.movie
                                        : T1.shop - T2.shop
                                    : T1.price - T2.price;
    };

    private long mask(int shop, int movie) {
        return (((long) shop) << 32) ^ ((long) movie);
    }
    public MovieRentingSystem(int n, int[][] entries) {
        for (int[] entry : entries) {
            int shop = entry[0];
            int movie = entry[1];
            int price = entry[2];
            long mask = mask(shop, movie);
            T entity = new T(movie, shop, price);
            k2e.put(mask, entity);
            m2e.computeIfAbsent(movie, m -> new TreeSet<>(compare))
                .add(entity);
        }
    }
    
    public List<Integer> search(int movie) {
        List<Integer> cheap5 = new ArrayList<>();
        TreeSet<T> entities = m2e.get(movie);
        if (entities == null)
            return cheap5;
        Iterator<T> it = entities.iterator();
        for (int i = 0; i < 5 && it.hasNext(); i++)
            cheap5.add(it.next().shop);
        return cheap5;
    }
    
    public void rent(int shop, int movie) {
        long mask = mask(shop, movie);
        T entity = k2e.get(mask);
        TreeSet<T> entities = m2e.get(movie);
        entities.remove(entity);
        rented.add(entity);
    }
    
    public void drop(int shop, int movie) {
        long mask = mask(shop, movie);
        T entity = k2e.get(mask);
        rented.remove(entity);
        m2e.computeIfAbsent(movie, m -> new TreeSet<>(compare))
                .add(entity);
    }
    
    public List<List<Integer>> report() {
        List<List<Integer>> report = new ArrayList<>();
        Iterator<T> it = rented.iterator();
        for (int i = 0; i < 5 && it.hasNext(); i++) {
            T entity = it.next();
            report.add(Arrays.asList(entity.shop, entity.movie));
        }
        return report;
    }
}

/**
 * Your MovieRentingSystem object will be instantiated and called as such:
 * MovieRentingSystem obj = new MovieRentingSystem(n, entries);
 * List<Integer> param_1 = obj.search(movie);
 * obj.rent(shop,movie);
 * obj.drop(shop,movie);
 * List<List<Integer>> param_4 = obj.report();
 */
