public class LargestPalindromeProduct {
    public static boolean palindrome(int y) {
        int reverse=0;
        int x=y;
        while(y>0){
            int r=y%10;
            reverse=reverse*10+r;
            y=y/10;
        }
        if(reverse==x) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        int maxi=Integer.MIN_VALUE;
        for(int i=100;i<=998;i++) {
            for(int j=i+1;j<=999;j++) {
                if(palindrome(i*j)) {
                    maxi=Math.max(maxi, i*j);
                }
            }
        }
        System.out.println(maxi);
    }
}



