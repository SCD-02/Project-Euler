public class SumSquareDifference {
  public static long sumOfSquare(long n) {
    return (n * (n + 1) * (2 * n + 1)) / 6;
  }

  public static long squareOfSum(long n) {
    long sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return (long) Math.pow(sum, 2);
  }

  public static void main(String[] args) {
    System.out.println(squareOfSum(100) - sumOfSquare(100));
  }
}