import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        // N층을 내려올때마다 경우의수는 2^N
        System.out.println((long) Math.pow(2, n));
    }
}