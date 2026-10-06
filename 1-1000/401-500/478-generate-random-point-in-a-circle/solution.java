class Solution {
  public Solution(double r, double x, double y) {
    this.r = r;
    this.x = x;
    this.y = y;
  }

  public double[] randPoint() {
    double length = Math.sqrt(Math.random()) * r;
    double degree = Math.random() * 2 * Math.PI;
    double x1 = x + length * Math.cos(degree);
    double y1 = y + length * Math.sin(degree);
    return new double[] {x1, y1};
  }

  private double r;
  private double x;
  private double y;
}
