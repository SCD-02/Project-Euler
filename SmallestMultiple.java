public class SmallestMultiple {
    public static void main(String[] args) {
        int n=20;
        long x = 1;
        for(long i=2;i<=n;i++) {
            x =lcm(x,i);
        }
        System.out.println(x);
    }
    public static long gcd(long a , long b) {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static long lcm(long a , long b) {
        return (a*b)/gcd(a,b);
    }
}
