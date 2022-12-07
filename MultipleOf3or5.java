public class MultipleOf3or5 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 3; i < 1000; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    System.out.println("sum of all multiples of 3 or 5 below 1000 is:" + sum);
  }
}