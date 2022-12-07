public class Prime_10001st{
    static boolean isPrime(long n ) {
        boolean flag = true;
        for(long i = 2l ;i*i<=n ;i++) {
            if(n % i == 0)
                flag = false;
        }
        return flag;
    }
    public static void main(String[] args) {
        long c = 0;
        long count = 0;
        for(long i = 2;i<Integer.MAX_VALUE ;i++) {
            if(isPrime(i))
                c++;
            if(c == 10001) {
                count= i;
                break;
            }
        }
        System.out.println(count);

    }
}
