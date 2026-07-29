class Solution {
  public boolean carPooling(int[][] trips, int capacity) {
    int currentPassengers = 0;
    int[] line = new int[1001];

    for (int[] trip : trips) {
      int nPassengers = trip[0];
      int start = trip[1];
      int end = trip[2];
      line[start] += nPassengers;
      line[end] -= nPassengers;
    }

    for (int passengerChange : line) {
      currentPassengers += passengerChange;
      if (currentPassengers > capacity)
        return false;
    }

    return true;
  }
}
