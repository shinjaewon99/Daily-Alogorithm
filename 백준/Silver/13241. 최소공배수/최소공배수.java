import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long x = in.nextLong();
        long y = in.nextLong();

        System.out.println(lcm(x, y));
    }

    // 최대 공약수
    private static long gcd(final long x, final long y) {

        if(y == 0) return x;

        return gcd(y, x % y);
    }

    // 최소 공배수
    private static long lcm(final long x, final long y){
        return x * y / gcd(x, y); 
    }
}
