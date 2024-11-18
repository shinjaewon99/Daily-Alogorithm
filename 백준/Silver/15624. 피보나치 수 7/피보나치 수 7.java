import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        System.out.println(fibo(t));
    }

    private static long fibo(final int num){
        long[] numbers = new long[num + 1];

        if (num >= 0) numbers[0] = 0;
        if (num >= 1) numbers[1] = 1;

        // 점화식 도출
        for(int i = 2; i <= num; i++){
            numbers[i] = (numbers[i - 1] + numbers[i - 2]) % 1000000007;
        }

        return numbers[num];
    }
}
