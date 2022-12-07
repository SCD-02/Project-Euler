public class PowerDigitSum {
  public static long cal(long n, long p) {
    long powerOfDig = (long) Math.pow(n, p);
    long sum = 0;
    while (powerOfDig != 0) {
      sum += powerOfDig % 10;
      powerOfDig = powerOfDig / 10;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(cal(2, 1000));
  }
}
