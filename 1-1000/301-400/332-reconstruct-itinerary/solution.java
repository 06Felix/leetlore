class Solution {
  public List<String> findItinerary(List<List<String>> tickets) {
    LinkedList<String> ans = new LinkedList<>();
    Map<String, Queue<String>> g = new HashMap<>();

    for (List<String> ticket : tickets) {
      g.putIfAbsent(ticket.get(0), new PriorityQueue<>());
      g.get(ticket.get(0)).offer(ticket.get(1));
    }

    dfs(g, "JFK", ans);
    return ans;
  }

  private void dfs(Map<String, Queue<String>> g, String u, LinkedList<String> ans) {
    Queue<String> arrivals = g.get(u);
    while (arrivals != null && !arrivals.isEmpty())
      dfs(g, arrivals.poll(), ans);
    ans.addFirst(u);
  }
}
