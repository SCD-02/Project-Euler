public class LargestPrimeFactor {
  public static long maxPrime(long n) {
    long maxprime = -1;
    while (n % 2 == 0) {
      maxprime = 2;
      n = n / 2;
    }
    while (n % 3 == 0) {
      maxprime = 3;
      n = n / 3;
    }
    for (int i = 5; i <= Math.sqrt(n); i++) {
      while (n % i == 0) {
        maxprime = i;
        n = n / i;
      }
      while (n % (i + 2) == 0) {
        maxprime = i + 2;
        n = n / (i + 2);
      }
    }
    if (n > 4) {
      maxprime = n;
    }
    return maxprime;
  }

  public static void main(String[] args) {
    System.out.println(maxPrime(600851475143l));
  }
}
